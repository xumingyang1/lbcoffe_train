package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.ZjhMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ZjhService.class)
@Component//把当前的类注入spring容器
public class ZjhServiceImpl implements ZjhService {

    @Autowired
    private ZjhMapper zjhMapper;




}
