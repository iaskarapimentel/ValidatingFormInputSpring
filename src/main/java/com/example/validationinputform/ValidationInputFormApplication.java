package com.example.validationinputform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidationInputFormApplication {

  public static void main(String[] args) {
    SpringApplication.run(ValidationInputFormApplication.class, args);
  }

//  To activate Spring MVC, you would normally add @EnableWebMvc to the Application class.
//  But Spring Boot’s @SpringBootApplication already adds this annotation when it detects
//  spring-webmvc on your classpath. This same annotation lets it find the annotated
//  @Controller class and its methods.

}
