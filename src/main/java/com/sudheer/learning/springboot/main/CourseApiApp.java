package com.sudheer.learning.springboot.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sudheer.learning.springboot.repository") // to enable JSPA repositories to be added
@EntityScan(basePackages = {"com.sudheer.learning.springboot.model"}) // we have to add this as we annotated model class with @Entity
@ComponentScan(basePackages = {"com.sudheer.learning.springboot"}) // this is to initialize other beans in the class path
public class CourseApiApp  {

    public static void main(String[] args) {

        SpringApplication.run(CourseApiApp.class, args);
    }

}
