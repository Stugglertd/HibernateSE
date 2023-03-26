package com.hibernateD.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Song {
//	songId, songName, singer
  @Id	
  @Column(name = "songId")
  private int id;
  @Column(name = "songName")
  private String songName;
  @Column(name = "singer")
  private String artist;
}
