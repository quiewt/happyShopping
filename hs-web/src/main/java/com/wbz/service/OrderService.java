package com.wbz.service;

import com.wbz.entity.Order;
import java.util.List;

/**
 * Created by wei on 2016/10/7.
 */
public interface OrderService {
    public List<Order> getOrders(String id,String status);
}
