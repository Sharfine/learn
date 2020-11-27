package com.sharfine.mybatisplus.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sharfine.mybatisplus.test.entity.User;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sharfine
 * @since 2020-11-23
 */
public interface IUserService extends IService<User> {

    List<User> listAllUser();

}
