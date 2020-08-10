package com.lcy.test;

import org.springframework.context.annotation.Bean;

/**
 * TODO:
 *  没有spring注解
 *
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/9 0:46
 */
public class UserConfiguration {

    @Bean
    public User getUser(){
        User user = new User();
        user.setUsername("tobyli");
        user.setAge(29);
        return user;
    }
}
