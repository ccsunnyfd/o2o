package com.imooc.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Process
 *
 * @version 1.0
 */
@Getter
@Setter
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    //是否允许登录
    private Integer enableStatus;
    //1.顾客 2.店家 3.超级管理员
    private Integer usertype;
    private Date createTime;
    private Date lastEditTime;
}
