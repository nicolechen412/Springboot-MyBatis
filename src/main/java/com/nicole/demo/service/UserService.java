package com.nicole.demo.service;

/*
 * author: Nicole
 * email : nicolechen412@163.com
 * date  : 2019/2/3 下午5:35
 * desc  :
 */

import com.nicole.demo.bean.User;

public interface UserService {
    Object listAll(int page, int size);

    int insert(User user);

    int remove(Integer userId);

    int update(User user);
}
