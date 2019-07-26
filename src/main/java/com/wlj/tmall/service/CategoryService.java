package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Category;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-24 15:47
 */
public interface CategoryService {
    List<Category> list();

    //int total();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
