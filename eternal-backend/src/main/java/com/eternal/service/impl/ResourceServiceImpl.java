package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Resource;
import com.eternal.service.ResourceService;
import com.eternal.mapper.ResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_resource】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource>
    implements ResourceService{

}




