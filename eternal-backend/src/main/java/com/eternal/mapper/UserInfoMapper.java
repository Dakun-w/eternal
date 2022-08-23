package com.eternal.mapper;

import com.eternal.enetity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author xiao
* @description 针对表【t_user_info】的数据库操作Mapper
* @createDate 2022-08-23 14:46:40
* @Entity com.eternal.enetity.UserInfo
*/
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




