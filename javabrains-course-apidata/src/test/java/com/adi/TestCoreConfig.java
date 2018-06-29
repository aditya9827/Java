package com.adi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javabrains.springboot.CourseApiApp;
import javabrains.springboot.course.CourseRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CourseApiApp.class)
public class TestCoreConfig {
	@Autowired
	private CourseRepository personRepo;

	@Test
	public void cdShouldNotBeNull() {
		System.out.println(personRepo);
	}
}
