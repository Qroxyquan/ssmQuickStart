package com.qroxy.crud.bean;

import java.util.Date;

public class Article {
    /* 文章id*/
    private Integer id;

    /* 用户id*/
    private Integer uId;

    /* 昵称*/
    private String nickname;

    /* 文章标题*/
    private String titlle;

    /* 文章内容*/
    private String content;

    /* 文章分类*/
    private String type;

    /* 文章点赞数*/
    private Integer like;

    /* 文章评论数*/
    private Integer comments;

    /* 用户头像url*/
    private String faceImage;

    /* 文章上传时间*/
    private Date uploadTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTitlle() {
        return titlle;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}