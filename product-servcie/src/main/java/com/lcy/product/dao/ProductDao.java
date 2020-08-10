package com.lcy.product.dao;

import com.lcy.product.vo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/7 19:05
 */
public interface ProductDao extends JpaRepository<Product, Long>,
        JpaSpecificationExecutor<Product>{
}
