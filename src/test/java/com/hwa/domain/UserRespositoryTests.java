package com.hwa.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author LiuHua
 * @date 2018/7/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRespositoryTests {

    private static Log log = LogFactory.getLog(UserRepository.class);
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        log.debug(formattedDate);
        System.err.println(formattedDate);
        System.out.println(userRepository.findByUserNameOrEmail("aa1", "aa"));
        System.out.println(userRepository.findAll());
//        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
//        log.debug(userRepository.findByUserName("aa1"));
//        Assert.assertEquals(9, userRepository.findAll().size());
//        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
//        userRepository.delete(userRepository.findByUserName("aa1"));
    }
}
