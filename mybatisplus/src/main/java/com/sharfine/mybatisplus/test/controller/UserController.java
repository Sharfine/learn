package com.sharfine.mybatisplus.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sharfine.mybatisplus.test.entity.User;
import com.sharfine.mybatisplus.test.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sharfine
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/test/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private SpringContextHelper springContextHelper;

    @GetMapping("test")
    public void test1() {
        Object user = springContextHelper.getBean("user");

        System.out.println(user.toString());

        User user1 = SpringUtils.getBean("user");
        System.out.println("user = " + user1);
    }

    @GetMapping("listNew")

    public String listNew() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        String s = "'运营部' or 1 = 1";
        //wrapper.inSql("dept_id","select id from dept where name = "+s);
        wrapper.inSql("dept_id", "select id from dept where name = '运营部'");
        //wrapper.notInSql("dept_id","select id from dept where name = '运营部'");

        //wrapper.last("and dept_id in (select id from dept where name = "+s+")");
        userService.list(wrapper).forEach(System.out::print);

        //List<User> list = userService.lambdaQuery().lt(User::getAge, 30).eq(User::getUserName,"张三").list();
        //List<User> list1 = userService.list(Wrappers.lambdaQuery().eq(User::getAge, 23).lt());
        return "";
    }

    @GetMapping("list")
    public String getAll() {
        List<User> list = userService.lambdaQuery().list();
        //List<User> list = userService.lambdaQuery().lt(User::getAge, 30).eq(User::getUserName,"张三").list();
        //List<User> list1 = userService.list(Wrappers.lambdaQuery().eq(User::getAge, 23).lt());
        return list.toString();
    }

    @GetMapping("listPage")
    public String listPage() {
        Page<User> page = new Page<>(2, 4);
        Page<User> page1 = userService.page(page);

        return page1.getRecords().toString();
    }

    @GetMapping("add")
    public boolean add() {
        User u = new User();
        u.setAge(66);
        u.setDeptId(1);
        u.setUserName("haha");
        boolean save = userService.save(u);
        return save;
    }

    @GetMapping("delete")
    public boolean delete() {

        boolean remove = userService.removeById(1);
        return remove;
    }

    @GetMapping("update")
    public boolean update() {
        User u = new User();
        u.setId(1);
        u.setAge(28);
        u.setVersion(1);
        //boolean update = userService.updateById(u);
        boolean update = userService.update(u, Wrappers.<User>lambdaQuery().eq(User::getAge, 266));
        return update;
    }

    @Test
    public void test() {
        System.out.println("aaaa");
    }

}
