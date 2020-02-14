package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.LscMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LscService.class)
@Component//把当前的类注入spring容器
public class LscServiceImpl implements LscService {

    @Autowired
    private LscMapper lscMapper;




}
