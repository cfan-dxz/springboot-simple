package com.example.mydemo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.mydemo.service.IHttpApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpApiServiceImpl implements IHttpApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public JSONObject request() {
        JSONObject obj = restTemplate.getForObject("http://192.168.8.73:6001/api/ComShop/GetListByPlatformId?platformId=1", JSONObject.class);
        return obj;
    }
}
