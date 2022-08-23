package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.UserAuth;
import com.eternal.service.UserAuthService;
import com.eternal.mapper.UserAuthMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_user_auth】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth>
    implements UserAuthService{

}




