package com.sharfine.mybatis.Dao;

import com.sharfine.mybatis.model.User;

import java.util.List;

/**
 * @author: Sharfine
 * @createTime: 2020/11/20 10:41
 */
public interface UserDao {

    void add(User user);

    boolean deleteById(Integer id);

    Integer updateById(User user);

    User getById(Integer id);

    List<User> getAll();

}
