package com.sharfine.mybatis.Controller;

import com.sharfine.mybatis.Dao.UserDao;
import com.sharfine.mybatis.model.Department;
import com.sharfine.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Sharfine
 * @createTime: 2020/11/20 14:16
 */
@RestController
@RequestMapping("mybatis")
public class UserController {
    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        User user = new User();
        System.out.println("user = " + user);
    }

    @GetMapping("add")
    public void add() {
        Department department = new Department();
        department.setId(1);

        //User user = new User(null, "李四", 24, department);
        //userDao.add(user);

        System.out.println("ok");

    }

    @GetMapping("select")
    public String select() {

        User byId = userDao.getById(1);

        return byId.toString();

    }

    @GetMapping("update")
    public Integer updete() {
        User u = new User();
        u.setId(1);
        u.setUserName("王五");
        Integer integer = userDao.updateById(u);

        return integer;

    }

    @GetMapping("hello")
    public String Hello() {
        return "hello";

    }


}
