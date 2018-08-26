package com.hwa.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LiuHua
 * @date 2018/8/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private Properties properties;

    @Test
    public void getHello(){
        System.out.println(properties.getTitle());
        Assert.assertEquals(properties.getTitle(),"纯洁的微笑");
        System.out.println(properties.getDescription());
        System.out.println("你好");
    }
}
