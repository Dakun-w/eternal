package com.eternal.mapper;

import com.eternal.enetity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author xiao
* @description 针对表【t_comment】的数据库操作Mapper
* @createDate 2022-08-23 14:46:40
* @Entity com.eternal.enetity.Comment
*/
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

}




