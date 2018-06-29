package com.example.demo.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public CDPlayer(SgtPeppers cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
