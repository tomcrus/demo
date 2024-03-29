package com.lagou.service.impl;

import com.lagou.dao.ResumeDao;
import com.lagou.pojo.Resume;
import com.lagou.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao  resumeDao;
    @Override
    public Resume findResumeByUserId(Long userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        resume.setIsDefault(1);
        Example<Resume> example = Example.of(resume);
        return resumeDao.findOne(example).get();
    }
}
