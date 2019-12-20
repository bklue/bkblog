package com.tyn.blog.service;

import com.tyn.blog.exception.AccountException;
import org.springframework.stereotype.Service;

/**
 * @author wangl
 * @Description todo
 * @date 12/20/2019 10:50 AM
 */
@Service
public class TestService {

    public String test(String s){
        if(1==1)
            throw new AccountException(2100,"账号已被封禁");
        return s;
    }
}
