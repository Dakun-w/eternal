package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.dto.*;
import com.eternal.enetity.Article;
import com.eternal.service.ArticleService;
import com.eternal.mapper.ArticleMapper;
import com.eternal.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiao
 * @description 针对表【t_article】的数据库操作Service实现
 * @createDate 2022-08-23 14:46:39
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public TopAndFeaturedArticlesDTO listTopAndFeaturedArticles() {
        return null;
    }

    @Override
    public PageResult<ArticleCardDTO> listArticles() {
        return null;
    }

    @Override
    public PageResult<ArticleCardDTO> listArticlesByCategoryId(Integer categoryId) {
        return null;
    }

    @Override
    public ArticleDTO getArticleById(Integer articleId) {
        return null;
    }

    @Override
    public PageResult<ArticleCardDTO> listArticlesByTagId(Integer tagId) {
        return null;
    }

    @Override
    public PageResult<ArchiveDTO> listArchives() {
        return null;
    }

    @Override
    public PageResult<ArticleAdminDTO> listArticlesAdmin(ConditionVO conditionVO) {
        return null;
    }

    @Override
    public void saveOrUpdateArticle(ArticleVO articleVO) {

    }

    @Override
    public void updateArticleTopAndFeatured(ArticleTopFeaturedVO articleTopFeaturedVO) {

    }

    @Override
    public void updateArticleDelete(DeleteVO deleteVO) {

    }

    @Override
    public void deleteArticles(List<Integer> articleIds) {

    }

    @Override
    public ArticleAdminViewDTO getArticleByIdAdmin(Integer articleId) {
        return null;
    }

    @Override
    public List<String> exportArticles(List<Integer> articleIdList) {
        return null;
    }

    @Override
    public List<ArticleSearchDTO> listArticlesBySearch(ConditionVO condition) {
        return null;
    }
}




