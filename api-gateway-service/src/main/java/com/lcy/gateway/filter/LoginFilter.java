package com.lcy.gateway.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created by Toby.Li on 2020/8/11.
 */
@Component
public class LoginFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1: 获取参数access-toekn
        String token = exchange.getRequest().getQueryParams().getFirst("access-token");
        //2: 判断token
        if(StringUtils.isEmpty(token)){
            //2.1: 如果不存在, 认证失败
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            //2.2: 请求结束
            return exchange.getResponse().setComplete();
        }
        //2.3: 如果存在, 继续向下执行
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
