package com.lcy.product.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/7 16:25
 */
@Data
@Entity
@Table(name = "tb_product")
public class Product{

    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
}
