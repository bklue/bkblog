package com.tyn.blog.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/12/2019 6:14 PM
 */
@Component
@Slf4j
public class TestUtil {
    @Async
    public void addTest (){
        try {
            log.info("异步成功");
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Async("MyAsync")
    public void addPoll (){
        try {
            log.info("更换线程池");
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
