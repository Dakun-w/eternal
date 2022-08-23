package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Tag;
import com.eternal.service.TagService;
import com.eternal.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_tag】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




