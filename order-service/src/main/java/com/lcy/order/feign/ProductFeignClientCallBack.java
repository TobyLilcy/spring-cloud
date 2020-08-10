package com.lcy.order.feign;

import com.lcy.order.vo.Product;
import org.springframework.stereotype.Component;

/**
 * Created by Toby.Li on 2020/8/10.
 */
@Component
public class ProductFeignClientCallBack implements ProductFeginClient {

    @Override
    public Product findById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setProductName("Feign: 熔断降级逻辑");
        return product;
    }
}
