package com.controller;

import com.interceptors.SessionData;
import com.model.User;
import com.model.UserBlog;
import com.service.UserBlogService;
import com.sun.tracing.dtrace.Attributes;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by saif23 on 11/21/2016.
 */
@Controller
public class BlogController {


    @Autowired
    private UserBlogService userBlogService;

    @Autowired
    SessionData sessionData;

    @RequestMapping(value = "/user/pblog", method = RequestMethod.GET)
    public String getBlog(Map<String, Object> map, Model model) {

        UserBlog userBlog = new UserBlog();
        model.addAttribute("blogList", userBlogService.getPost(sessionData.getUser().getId()));
        model.addAttribute("name", sessionData.getUser().getName());
        return "Blog";
    }
}
