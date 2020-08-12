package com.lcy.test;

import com.lcy.out.OutStreamServiceApplication;
import com.lcy.out.message.OutMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Toby.Li on 2020/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OutStreamServiceApplication.class)//如果跟启动类不是同一个包路径需要指定一下
public class OutStreamApplicationTest {

    @Autowired
    private OutMessage outMessage;

    @Test
    public void testSend(){
        outMessage.send("Toby li11111111111111111111");
    }
}
