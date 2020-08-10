package com.lcy.product.service;

import com.lcy.product.vo.Product;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/7 19:35
 */
public interface ProductService {

    Product findById(Long id);
}
