package com.nicole.demo.bean;

/*
 * author: Nicole
 * email : nicolechen412@163.com
 * date  : 2019/2/3 下午5:33
 * desc  :
 */

import lombok.Data;

import java.util.Date;
@Data
public class User {

    //主键ID
    private Integer id;

    //用户名
    private String username;

    //密码
    private String password;

    //创建时间
    private Date gmtCreate;

    //修改时间
    private Date gmtModified;
}
