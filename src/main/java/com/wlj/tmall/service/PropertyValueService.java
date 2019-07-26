package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Product;
import com.wlj.tmall.pojo.PropertyValue;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 14:01
 */
public interface PropertyValueService {
    void init(Product p);

    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);

    List<PropertyValue> list(int pid);
}
