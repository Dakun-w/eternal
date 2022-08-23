package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Comment;
import com.eternal.service.CommentService;
import com.eternal.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_comment】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




