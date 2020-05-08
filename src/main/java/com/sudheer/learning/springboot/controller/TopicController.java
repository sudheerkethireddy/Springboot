package com.sudheer.learning.springboot.controller;

import com.sudheer.learning.springboot.model.Topic;
import com.sudheer.learning.springboot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return topicService.getTopic(id).get();
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {

        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {

        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
