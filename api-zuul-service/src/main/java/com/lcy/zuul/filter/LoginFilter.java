package com.lcy.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Toby.Li on 2020/8/11.
 */
@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        //返回ture代码过滤生效
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //登录检验逻辑
        //1: 获取zuul提供的请求上下文的对象
        RequestContext context = RequestContext.getCurrentContext();
        //2: 从上下文对象中获取request对象
        HttpServletRequest request = context.getRequest();
        //3: 从请求中获取token
        String token = request.getParameter("account-token");
        //4: 判断
        if(StringUtils.isEmpty(token)){
            //没有token, 登录检验失败
            context.setSendZuulResponse(false);
            //返回401状态码, 也可以考虑从定向回登录页面
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        //通过检验, 可以考虑把用户信息放入上下文, 继续向后执行
        return null;
    }
}
