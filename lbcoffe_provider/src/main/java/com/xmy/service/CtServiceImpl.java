package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.CtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = CtService.class)
@Component//把当前的类注入spring容器
public class CtServiceImpl implements CtService {

    @Autowired
    private CtMapper ctMapper;




}
