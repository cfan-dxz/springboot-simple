package com.example.mydemo.web;

import cn.hutool.log.StaticLog;
import com.alibaba.fastjson.JSONObject;
import com.example.mydemo.common.ApiResponse;
import com.example.mydemo.common.RedisUtil;
import com.example.mydemo.service.IHttpApiService;
import com.example.mydemo.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@Api(value = "测试", tags = {"测试接口"})
public class TestController {
    @Autowired
    private ITestService testService;
    @Resource
    private RedisUtil redisUtil;
    @Autowired
    private IHttpApiService httpApiService;

    @ApiOperation(value = "ok", notes = "ok检查")
    @GetMapping("ok")
    public ApiResponse ok() {
        String res = testService.ok();
        return ApiResponse.success(res);
    }

    @ApiOperation(value = "get", notes = "get检查")
    @GetMapping("get")
    public ApiResponse get() {
        Object res = redisUtil.get("this00001");
        StaticLog.info("This is static {} log.", "INFO");
        return ApiResponse.success(res);
    }

    @ApiOperation(value = "httpapi", notes = "httpapi测试")
    @GetMapping("testHttpApi")
    public JSONObject testHttpApi() {
        JSONObject obj = httpApiService.request();
        return obj;
    }
}
