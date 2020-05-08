package com.sudheer.learning.springboot.repository;


import com.sudheer.learning.springboot.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * If you are doing basic operations on the data repositiy, you need to implement specific DAO class,
 * just make sure you extend the CrudRepositry class
 */
@Repository
public interface TopicRespository extends CrudRepository<Topic, String > {


}
