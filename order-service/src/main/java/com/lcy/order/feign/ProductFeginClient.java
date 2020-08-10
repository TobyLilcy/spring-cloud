package com.lcy.order.feign;

import com.lcy.order.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/9 14:48
 * <p>
 * TODO:
 */
@FeignClient(name = "product-service")
public interface ProductFeginClient {

    @GetMapping(value = "/product/{id}")
    public Product findById(@PathVariable("id") Long id);
}
