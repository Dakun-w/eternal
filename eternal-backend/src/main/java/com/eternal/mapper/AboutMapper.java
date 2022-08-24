package com.eternal.mapper;

import com.eternal.dto.ArticleCardDTO;
import com.eternal.enetity.About;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author xiao
* @description 针对表【t_about】的数据库操作Mapper
* @createDate 2022-08-23 14:46:39
* @Entity com.eternal.enetity.About
*/
@Repository
public interface AboutMapper extends BaseMapper<About> {
}




