package com.lcy.test;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/9 0:56
 * <p>
 * TODO:
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(UserImportSelector.class)
public @interface EnableUserBean {
}
