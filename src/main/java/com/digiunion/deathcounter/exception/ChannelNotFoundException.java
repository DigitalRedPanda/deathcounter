package com.digiunion.deathcounter.exception;

public class ChannelNotFoundException extends RuntimeException {
 public ChannelNotFoundException(String channelName) {
  super("%s was not found".formatted(channelName));
 }
}
