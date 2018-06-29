package com.example.demo.spring.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private SgtPeppers cd;

	// @Autowired
	// private CDPlayer mp;

	@Test
	// @Ignore
	public void cdShouldNotBeNull() {
		System.out.println(cd);
		// System.out.println("T");
		assertNotNull(cd);
	}

	@Test
	public void titleNotNull() {
		assertEquals("Sgt. Pepper's Lonely Hearts Club Band", cd.getTitle());
	}

	// @Test
	// @Ignore
	// public void mpShouldNotBeNull() {
	// System.out.println(mp);
	// assertNotNull(mp);
	// }

}
