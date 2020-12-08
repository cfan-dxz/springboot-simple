package com.example.mydemo.web;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mydemo.common.ApiResponse;
import com.example.mydemo.dto.sys.UserDTO;
import com.example.mydemo.entity.SysUser;
import com.example.mydemo.service.ISysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 前端控制器
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation(value = "获取列表", notes = "用户列表")
    @GetMapping("getList")
    public ApiResponse<List<SysUser>> getList(){
        List<SysUser> list = sysUserService.getByCache();
        return ApiResponse.success(list);
    }

    @ApiOperation(value = "获取分页列表", notes = "用户列表")
    @PostMapping("getPageList")
    public ApiResponse<IPage<SysUser>> getPageList(@RequestBody UserDTO dto){
        IPage<SysUser> list = sysUserService.getPageList(dto);
        return ApiResponse.success(list);
    }
}

