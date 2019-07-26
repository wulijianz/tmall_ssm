package com.wlj.tmall.service;

import com.wlj.tmall.pojo.Order;
import com.wlj.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @author wlj
 * @create 2019-07-25 15:04
 */
public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);

    void update(Order c);

    Order get(int id);

    List list();

    float add(Order c, List<OrderItem> ois);

    List list(int uid, String excludedStatus);
}
