package com.wlj.tmall.service;

import com.wlj.tmall.pojo.User;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 14:08
 */
public interface UserService {
    void add(User c);

    void delete(int id);

    void update(User c);

    User get(int id);

    List list();

    boolean isExist(String name);

    User get(String name, String password);
}
