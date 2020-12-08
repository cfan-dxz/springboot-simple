package com.example.mydemo.web;


import com.example.mydemo.common.ApiResponse;
import com.example.mydemo.entity.ComShop;
import com.example.mydemo.service.IComShopService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 店铺表 前端控制器
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
@RestController
@RequestMapping("/comShop")
public class ComShopController {
    @Autowired
    private IComShopService shopService;

    @ApiOperation(value = "获取列表", notes = "用户列表")
    @GetMapping("getList")
    public ApiResponse<List<ComShop>> getList(){
        List<ComShop> list = shopService.list();
        return ApiResponse.success(list);
    }
}

