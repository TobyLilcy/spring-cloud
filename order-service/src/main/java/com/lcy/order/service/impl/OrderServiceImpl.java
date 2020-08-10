package com.lcy.order.service.impl;

import com.lcy.order.feign.ProductFeginClient;
import com.lcy.order.service.OrderService;
import com.lcy.order.vo.Product;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sun.plugin.com.DispatchClient;

import javax.swing.*;
import java.util.List;

/**
 * TODO:
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/8 9:33
 */
@Service
//@DefaultProperties(defaultFallback = "defaultFallback")
public class OrderServiceImpl implements OrderService {

    //2: 通过restTemplate调用服务
    @Autowired
    private RestTemplate restTemplate;
    //4:调用服务
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ProductFeginClient productFeginClient;


//    @HystrixCommand(fallbackMethod = "findByIdFallback")
//    @HystrixCommand()
    @Override
    public Product findById(Long id) {

//        return restTemplate.getForObject("http://192.168.0.6:9001/product/" + id, Product.class);

//        List<ServiceInstance> instances = discoveryClient.getInstances("product-service");
//        for(ServiceInstance instance: instances){
//            System.out.println(instance);
//        }
//        String url = "http://"+  instances.get(0).getHost()+ ":" + instances.get(0).getPort() + "/product/" + id;
//        System.out.println(url);
//        return restTemplate.getForObject(url, Product.class);

//        Product product = restTemplate.getForObject("http://product-service:9001/product/" + id, Product.class);
//        return product;`

        Product product = productFeginClient.findById(id);
        return product;

    }

    public Product findByIdFallback(Long id){
        Product product = new Product();
        product.setId(id);
        product.setProductName("熔断: 触发降级方法");
        return product;
    }

    public Product defaultFallback(){
        Product product = new Product();
        product.setProductName("熔断: 触发统一的降级方法");
        return product;
    }
}
