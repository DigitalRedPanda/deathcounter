package com.digiunion.deathcounter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Entity
@Getter
public class Channel {
 @NonNull
 @Id
 private final String name;

 @Column(columnDefinition = "DEFAULT 0")
 @Setter
 private int counter;

}
