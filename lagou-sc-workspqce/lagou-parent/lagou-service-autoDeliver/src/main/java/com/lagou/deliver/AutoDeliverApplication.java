package com.lagou.deliver.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AutoDeliverApplication {
    public static void main(String[] args) {

        SpringApplication.run(AutoDeliverApplication.class,args);
    }

    @Bean
    RestTemplate getRestTempalte(){
        return  new RestTemplate();
    }
}
