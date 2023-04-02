package com.jung.app.boxlogapp;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
@ComponentScan("com.jung.common.*")
@ComponentScan("com.jung.app.monitoringapp.*")
public class BoxLogApplication {
    public static void main(String[] args) {

        SpringApplication.run(BoxLogApplication.class, args);
    }
}
