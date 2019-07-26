package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Review;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 16:46
 */
public interface ReviewService {

    void add(Review c);

    void delete(int id);

    void update(Review c);

    Review get(int id);

    List list(int pid);

    int getCount(int pid);
}
