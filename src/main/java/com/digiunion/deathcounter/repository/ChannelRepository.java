package com.digiunion.deathcounter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digiunion.deathcounter.model.Channel;

public interface ChannelRepository extends JpaRepository<Channel, String> {
}
