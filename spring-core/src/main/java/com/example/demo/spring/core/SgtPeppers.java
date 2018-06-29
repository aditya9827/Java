package com.example.demo.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sgtPeppersBean")
public class SgtPeppers implements CompactDisc {

	// private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	// private String artist = "The Beatles";

	private String title;
	private String artist;

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Autowired
	public SgtPeppers(@Value("Sgt. Pepper's Lonely Hearts Club Band") String a, @Value("The Beatles") String b) {
		this.title = a;
		this.artist = b;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
