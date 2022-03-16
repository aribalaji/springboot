package com.in28minutes.springboots.basics.springbootin10steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIn10StepsApplication {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.debug("Starting Spring Application!");
        SpringApplication.run(SpringBootIn10StepsApplication.class, args);
    }

}
