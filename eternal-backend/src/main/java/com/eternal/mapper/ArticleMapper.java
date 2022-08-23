package com.eternal.mapper;

import com.eternal.enetity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author xiao
* @description 针对表【t_article】的数据库操作Mapper
* @createDate 2022-08-23 14:46:39
* @Entity com.eternal.enetity.Article
*/
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

}




