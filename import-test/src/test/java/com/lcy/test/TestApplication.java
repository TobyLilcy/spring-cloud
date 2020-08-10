package com.lcy.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/9 0:58
 * <p>
 * TODO:
 */
@EnableUserBean
public class TestApplication {

    public static void main(String[] args) {
        //获取spring容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestApplication.class);
        User bean = ac.getBean(User.class);
        System.out.println(bean);
    }
}
