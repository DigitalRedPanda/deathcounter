package com.digiunion.deathcounter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digiunion.deathcounter.exception.ChannelNotFoundException;
import com.digiunion.deathcounter.model.Channel;
import com.digiunion.deathcounter.repository.ChannelRepository;

@Service
public class CounterService {

  @Autowired
  ChannelRepository repository;

  public int getCounter(String channelName) {
    return repository.findById(channelName).map(Channel::getCounter)
        .orElseThrow(() -> new ChannelNotFoundException(channelName));
  }

  public int count(String channelName) {
    return repository.findById(channelName).map(channel -> {
      channel.setCounter(channel.getCounter() + 1);
      repository.save(channel);
      return channel.getCounter();
    }).orElseThrow(() -> new ChannelNotFoundException(channelName));
  }
}
