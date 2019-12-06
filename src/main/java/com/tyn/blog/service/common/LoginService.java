package com.tyn.blog.service.common;

import com.tyn.blog.constant.Aliyun;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author wanglei
 * @Description todo
 * @date 11/28/2019 10:55 AM
 */

@Slf4j
@Service
public class LoginService {
    @Value("${server.port}")
    public String  s;

    @Autowired
    private Aliyun aliyun;

    public void sb(){
        System.out.println(aliyun.getAppKey());
    }
    public static void main(String[] args) {

        LoginService l = new LoginService();
        l.sb();
        System.out.println(l.s);
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
