package com.lcy.test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author TobyLi
 * @version 1.0
 * @date 2020/8/9 0:52
 * <p>
 * TODO:
 */
public class UserImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //获取配置类的名称
        return new String[]{UserConfiguration.class.getName()};
    }
}
