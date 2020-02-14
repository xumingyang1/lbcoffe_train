package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.LbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LbService.class)
@Component//把当前的类注入spring容器
public class LbServiceImpl implements LbService {

    @Autowired
    private LbMapper lbMapper;




}
