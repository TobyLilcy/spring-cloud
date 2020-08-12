package com.lcy.input.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * Created by Toby.Li on 2020/8/12.
 */
@Component
@EnableBinding(Sink.class)
public class InputMessage {

    @StreamListener(Sink.INPUT)
    public void input(String s){
        System.out.println(s);
    }
}
