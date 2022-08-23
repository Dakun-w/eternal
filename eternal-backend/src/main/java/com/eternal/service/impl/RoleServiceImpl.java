package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Role;
import com.eternal.service.RoleService;
import com.eternal.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_role】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




