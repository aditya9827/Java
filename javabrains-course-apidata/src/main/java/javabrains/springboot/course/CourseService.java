package javabrains.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(int topicId) {
		List<Course> topics = new ArrayList<>();
		// courseRepository.findAll().forEach(topics::add);
		courseRepository.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}

	public Course getCourse(int id) {
		// return topics.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
		// topics.add(topic);
	}

	public void updateCourse(String id, Course topic) {
		courseRepository.save(topic);
	}

	public void deleteCourse(int id) {
		// topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}

}
