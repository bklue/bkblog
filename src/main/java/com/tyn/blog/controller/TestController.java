package com.tyn.blog.controller;

import com.tyn.blog.utils.TestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangl
 * @Description todo
 * @date 12/12/2019 2:55 PM
 */
@RestController
public class TestController {
    @Autowired
    private TestUtil util;
    //与直接注释@Slf4j作用类似，底层框架必须包含 org.slf4j.impl.StaticLoggerBindder,slf4j将会主动去寻找这个类
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @Value("${god}")
    private String god;

    @RequestMapping("/home")
    public String home(){
        return god;
    }

    @RequestMapping("/as1")
    public String as1(){
        util.addTest();
        return "successful";
    }
    @RequestMapping("/as2")
    public String as2(){
        util.addPoll();
        return  "change  successful";
    }
}
