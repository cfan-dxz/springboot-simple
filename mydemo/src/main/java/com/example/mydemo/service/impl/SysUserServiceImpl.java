package com.example.mydemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mydemo.dto.sys.UserDTO;
import com.example.mydemo.entity.SysUser;
import com.example.mydemo.mapper.SysUserMapper;
import com.example.mydemo.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Cacheable(cacheNames = "SysUserServiceImpl.getByCache")
    @Override
    public List<SysUser> getByCache() {
        return super.list();
    }

    @Override
    public IPage<SysUser> getPageList(UserDTO dto) {
        QueryWrapper<SysUser> query = new QueryWrapper<SysUser>();
        query.like(dto.getUserName() != null, "user_name", dto.getUserName());
        IPage<SysUser> page = new Page<SysUser>(dto.getPage(), dto.getLimit());
        logger.info(query.getTargetSql());
        return page(page, query);
    }
}
