package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Article;
import com.eternal.service.ArticleService;
import com.eternal.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
 * @author xiao
 * @description 针对表【t_article】的数据库操作Service实现
 * @createDate 2022-08-23 14:46:39
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}




