package com.sudheer.learning.springboot.service;

import com.sudheer.learning.springboot.model.Topic;
import com.sudheer.learning.springboot.repository.TopicRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired(required = true)
    private TopicRespository topicRespository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring framework description"),
            new Topic("java", "Java Framework", "Java description"),
            new Topic("javascript", "javascript Framework", "javascript description")));

    public List<Topic> getAllTopics() {


        List<Topic> topics = new ArrayList<>();
        topicRespository.findAll().forEach( x-> topics.add(x));
        return topics;
    }

    public Optional<Topic> getTopic(String topicId) {
        return topics.stream().filter(x -> x.getId().equalsIgnoreCase(topicId)).findAny();
    }

    public void addTopic(Topic topic) {

        topicRespository.save(topic);
        //topics.add(topic);
    }


    public void updateTopic(Topic topic, String id) {

       topicRespository.deleteById(id);
       topicRespository.save(topic);
    }

    public void deleteTopic(String id) {

        topicRespository.deleteById(id);
        //topics.removeIf( x -> x.getId().equalsIgnoreCase(id));
    }


   /* public static void main(String args[]) {

        TopicService topicService = new TopicService();
        System.out.println(topicService.getTopic("spring").getDescription());
    }*/
}
