package com.sharfine.mybatisplus.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sharfine.mybatisplus.test.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sharfine
 * @since 2020-11-23
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    List<User> listAllUser();

}
