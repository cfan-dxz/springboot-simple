package com.example.mydemo.service.impl;

import com.example.mydemo.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {

    @Override
    public String ok() {
        return "this ok!";
    }
}
