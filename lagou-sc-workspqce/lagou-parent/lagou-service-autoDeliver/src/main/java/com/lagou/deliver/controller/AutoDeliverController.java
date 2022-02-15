package com.lagou.deliver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/autodeliver")
public class AutoDeliverController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/checkstate/{userId}")
    public Integer getStateByUserId(@PathVariable Long userId){
        //远程接口调用
      return   restTemplate.getForObject("http://localhost:8080/resume/openstate/"+userId,Integer.class);
    }
    @GetMapping("/test")
    public String test(){
        return "222";
    }
}
