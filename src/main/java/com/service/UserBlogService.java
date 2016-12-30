package com.service;

import com.model.UserBlog;

import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
public interface UserBlogService {
    public void addBlog(UserBlog userBlog);
    public List getPost(long userid);
    public List getAllBlog();
}
