package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Category;
import com.wlj.tmall.pojo.Product;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 12:34
 */
public interface ProductService {
    void add(Product p);

    void delete(int id);

    void update(Product p);

    Product get(int id);

    List list(int cid);

    void setFirstProductImage(Product p);

    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
