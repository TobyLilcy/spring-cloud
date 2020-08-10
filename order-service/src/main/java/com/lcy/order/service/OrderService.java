package com.lcy.order.service;

import com.lcy.order.vo.Product;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/8 9:32
 */
public interface OrderService {
    Product findById(Long id);
}
