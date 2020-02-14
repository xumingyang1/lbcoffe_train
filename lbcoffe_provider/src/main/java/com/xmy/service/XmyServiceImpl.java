package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.XmyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = XmyService.class)
@Component//把当前的类注入spring容器
public class XmyServiceImpl implements XmyService {

    @Autowired
    private XmyMapper xmyMapper;




}
