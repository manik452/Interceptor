package com.service;

import com.model.UserBlog;
import com.model.UserBlogViewModel;
import com.mysql.cj.core.util.Util;
import com.repository.UserBlogDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
@Service
@Transactional
public class UserBlogServiceImp implements UserBlogService {

    @Autowired
    private UserBlogDao userBlogDao;

    @Override
    public void addBlog(UserBlog userBlog) {
        userBlogDao.addBlog(userBlog);
    }

    @Override
    public List getPost(long userid) {
        List<UserBlog> entity = userBlogDao.getPost(userid);
        List<UserBlogViewModel> userBlogViewModels = new ArrayList<UserBlogViewModel>();
        for(UserBlog userBlog : entity){
            UserBlogViewModel userBlogViewModel = new UserBlogViewModel();
            userBlogViewModel.setCommentID(userBlog.getCommentID());
            userBlogViewModel.setDescriptionOfComment(userBlog.getDescriptionOfComment());
            userBlogViewModel.setSubjectOfComment(userBlog.getSubjectOfComment());
            userBlogViewModel.setUser_id(userBlog.getUser_id());
            userBlogViewModel.setPostDate(userBlog.getDate().toString());
            userBlogViewModels.add(userBlogViewModel);
        }
        return userBlogViewModels;
    }
    @Override
    public List getAllBlog() {
        return userBlogDao.getAllBlog();
    }
}
