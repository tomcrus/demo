package com.lagou.controller;

import com.lagou.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @GetMapping("/openstate/{userId}")
    public Integer getDefaultResumeState(@PathVariable  Long userId){
     return    resumeService.findResumeByUserId(userId).getIsOpenResume();
    }

}
