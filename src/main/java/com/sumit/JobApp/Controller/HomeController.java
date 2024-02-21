package com.sumit.JobApp.Controller;

import com.sumit.JobApp.Model.JobPost;
import com.sumit.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    public JobService service;

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handle(JobPost jobPost,Model model){
        model.addAttribute("jobPost", jobPost);
        service.addJobPost(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {
        List<JobPost> jobPosts = service.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}
