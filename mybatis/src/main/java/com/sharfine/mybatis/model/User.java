package com.sharfine.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Sharfine
 * @createTime: 2020/11/20 10:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String userName;

    private Integer age;

    private Department dept;

    private String aaa;
}
