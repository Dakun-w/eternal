package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.UserInfo;
import com.eternal.service.UserInfoService;
import com.eternal.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_user_info】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




