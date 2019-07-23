package com.yuanshijia.sblog;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuanshijia.sblog.entity.User;
import com.yuanshijia.sblog.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        
    }


    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList.size());
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectPage() {
        System.out.println(("----- selectAll method test ------"));
        IPage<User> selectPage = userMapper.selectPage(new Page(1, 2));
        System.out.println(selectPage.getTotal());

        List<User> userList = selectPage.getRecords();
        System.out.println(userList.size());
//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
