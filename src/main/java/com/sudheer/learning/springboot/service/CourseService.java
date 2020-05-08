package com.sudheer.learning.springboot.service;

import com.sudheer.learning.springboot.model.Course;
import com.sudheer.learning.springboot.repository.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRespository courseRespository;



    public List<Course> getAllCourses(String id) {

        List<Course> courses = new ArrayList<>();
        courseRespository.findByTopicId(id).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String courseId) {
        return courseRespository.findById(courseId);
    }

    public void addCourse(Course course) {
        courseRespository.save(course);
    }


    public void updateCourse(Course course) {
        courseRespository.save(course);
    }

    public void deleteCourse(String id) {
        courseRespository.deleteById(id);
    }
}
