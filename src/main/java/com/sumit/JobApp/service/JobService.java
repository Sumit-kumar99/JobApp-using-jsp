package com.sumit.JobApp.service;

import com.sumit.JobApp.Model.JobPost;
import com.sumit.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo jobRepo;

    //method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return jobRepo.returnAllJobPosts();
    }

    public void addJobPost(JobPost jobPost) {
        jobRepo.addJobPost(jobPost);
    }
}
