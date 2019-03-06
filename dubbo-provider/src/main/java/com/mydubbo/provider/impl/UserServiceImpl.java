package com.mydubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mydubbo.api.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author liyingjie
 * @Title: UserServiceImpl
 * @Description: ss
 * @date 2019/3/1
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(String name) {
        return "hi,this is "+ name ;
    }
}
