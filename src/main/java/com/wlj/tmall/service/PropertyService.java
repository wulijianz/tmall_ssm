package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Property;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 11:31
 */
public interface PropertyService {
    void add(Property c);

    void delete(int id);

    void update(Property c);

    Property get(int id);

    List list(int cid);
}
