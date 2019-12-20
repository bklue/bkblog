package com.tyn.blog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 5:11 PM
 */
@Component
public class QueueTest {
    @Autowired
    private QueueSender send;

    public void send1(){
        send.sendTest();
    }



}
