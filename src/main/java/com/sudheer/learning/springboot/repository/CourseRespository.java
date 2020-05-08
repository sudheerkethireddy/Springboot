package com.sudheer.learning.springboot.repository;


import com.sudheer.learning.springboot.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * If you are doing basic operations on the data repositiy, you need to implement specific DAO class,
 * just make sure you extend the CrudRepositry class
 */
@Repository
public interface CourseRespository extends CrudRepository<Course, String > {

    /**
     * Here we wanted to find the courses by the topic, since the property is object we have to add object plus the
     * property of the object **/
    public List<Course> findByTopicId(String name);

}
