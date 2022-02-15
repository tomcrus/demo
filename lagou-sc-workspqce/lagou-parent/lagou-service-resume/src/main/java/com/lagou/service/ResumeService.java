package com.lagou.service;

import com.lagou.pojo.Resume;

public interface ResumeService {
    Resume findResumeByUserId(Long userId);
}
