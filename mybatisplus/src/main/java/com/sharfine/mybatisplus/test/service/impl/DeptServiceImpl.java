package com.sharfine.mybatisplus.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharfine.mybatisplus.test.entity.Dept;
import com.sharfine.mybatisplus.test.mapper.DeptMapper;
import com.sharfine.mybatisplus.test.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sharfine
 * @since 2020-11-23
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
