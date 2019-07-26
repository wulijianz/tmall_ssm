package com.wlj.tmall.service;

import com.wlj.tmall.pojo.ProductImage;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 13:32
 */
public interface ProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);

    void delete(int id);

    void update(ProductImage pi);

    ProductImage get(int id);

    List list(int pid, String type);
}
