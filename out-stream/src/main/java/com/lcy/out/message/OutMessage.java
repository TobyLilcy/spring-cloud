package com.lcy.out.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Toby.Li on 2020/8/12.
 */
@Component
@EnableBinding(Source.class)
public class OutMessage {

    @Autowired
    private MessageChannel output;

    public void send(String s){
        output.send(MessageBuilder.withPayload(s).build());
    }
}
