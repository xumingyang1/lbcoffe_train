package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.LjqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LjqService.class)
@Component//把当前的类注入spring容器
public class LjqServiceImpl implements LjqService {

    @Autowired
    private LjqMapper lbqMapper;




}
