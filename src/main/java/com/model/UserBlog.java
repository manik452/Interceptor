package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * Created by saif23 on 11/21/2016.
 */
@Entity
@Table(name = "BLOG_TABLE")
public class UserBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int commentID;

    @Column
    private long user_id;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column
    private Date postDate;

    @Column
    private String subjectOfComment;

    @Column
    private String descriptionOfComment;

    public UserBlog() {
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return postDate;
    }

    public void setDate(Date date) {
        this.postDate = date;
    }

    public int getCommentID() {

        return commentID;
    }

    public String getSubjectOfComment() {
        return subjectOfComment;
    }

    public void setSubjectOfComment(String subjectOfComment) {
        this.subjectOfComment = subjectOfComment;
    }

    public String getDescriptionOfComment() {
        return descriptionOfComment;
    }

    public void setDescriptionOfComment(String descriptionOfComment) {
        this.descriptionOfComment = descriptionOfComment;
    }
}
