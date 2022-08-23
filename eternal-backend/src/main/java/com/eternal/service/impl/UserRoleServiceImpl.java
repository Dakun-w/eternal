package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.UserRole;
import com.eternal.service.UserRoleService;
import com.eternal.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_user_role】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




