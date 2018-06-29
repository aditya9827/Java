package javabrains.springboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javabrains.springboot.topic.Topic;

@RestController

public class CourseController {

	@Autowired
	private CourseService courseServcie;

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable int topicId) {
		return courseServcie.getAllCourses(topicId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable int courseId) {
		return courseServcie.getCourse(courseId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
		course.setTopic(new Topic("", topicId, ""));
		courseServcie.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable String courseId) {
		course.setTopic(new Topic("", topicId, ""));
		courseServcie.updateCourse(courseId, course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable int courseId) {
		courseServcie.deleteCourse(courseId);
	}

}
