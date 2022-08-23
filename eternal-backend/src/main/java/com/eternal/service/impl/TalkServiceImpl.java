package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Talk;
import com.eternal.service.TalkService;
import com.eternal.mapper.TalkMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_talk】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class TalkServiceImpl extends ServiceImpl<TalkMapper, Talk>
    implements TalkService{

}




