package com.sharfine.mybatisplus.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharfine.mybatisplus.test.controller.UserController;
import com.sharfine.mybatisplus.test.entity.User;
import com.sharfine.mybatisplus.test.mapper.UserMapper;
import com.sharfine.mybatisplus.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sharfine
 * @since 2020-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserController userController;

    @Override
    public List<User> listAllUser() {
        return userMapper.listAllUser();
    }

    ;
}
