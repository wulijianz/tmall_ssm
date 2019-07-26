package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Order;
import com.wlj.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 14:26
 */
public interface OrderItemService {

    void add(OrderItem c);

    void delete(int id);

    void update(OrderItem c);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order o);

    int getSaleCount(int  pid);

    List<OrderItem> listByUser(int uid);
}
