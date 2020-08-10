package com.lcy.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/8 9:29
 */
@Data
public class Product {

    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
}
