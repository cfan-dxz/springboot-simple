package com.example.mydemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mydemo.dto.sys.UserDTO;
import com.example.mydemo.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 服务类
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
public interface ISysUserService extends IService<SysUser> {
    List<SysUser> getByCache();

    IPage<SysUser> getPageList(UserDTO dto);
}
