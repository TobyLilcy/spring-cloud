package com.lcy.product.service.impl;

import com.lcy.product.dao.ProductDao;
import com.lcy.product.service.ProductService;
import com.lcy.product.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/7 19:39
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Override
    public Product findById(Long id) {
        Product product = productDao.findById(id).get();
        product.setProductName(port + " : " + ip);
        return product;
    }
}
