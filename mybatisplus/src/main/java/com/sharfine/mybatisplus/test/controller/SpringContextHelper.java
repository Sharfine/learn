package com.sharfine.mybatisplus.test.controller;

import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;

/**
 * @author: Sharfine
 * @createTime: 2020/11/25 15:10
 */
@Component
public class SpringContextHelper extends ApplicationObjectSupport {

    public Object getBean(String beanName) {
        return getApplicationContext().getBean(beanName);
    }

}
