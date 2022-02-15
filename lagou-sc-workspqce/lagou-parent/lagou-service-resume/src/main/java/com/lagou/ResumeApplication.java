package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.lagou.pojo")
public class ResumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class,args);
    }
}
