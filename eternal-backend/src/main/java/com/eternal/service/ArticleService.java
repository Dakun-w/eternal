package com.eternal.service;

import com.eternal.dto.*;
import com.eternal.enetity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eternal.vo.*;

import java.util.List;

/**
* @author xiao
* @description 针对表【t_article】的数据库操作Service
* @createDate 2022-08-23 14:46:39
*/
public interface ArticleService extends IService<Article> {

    /**
     *首页置顶与推荐
     * @return
     */
    TopAndFeaturedArticlesDTO listTopAndFeaturedArticles();

    /**
     * 分页查询
     * @return
     */
    PageResult<ArticleCardDTO> listArticles();



    PageResult<ArticleCardDTO> listArticlesByCategoryId(Integer categoryId);



    ArticleDTO getArticleById(Integer articleId);



    PageResult<ArticleCardDTO> listArticlesByTagId(Integer tagId);

    PageResult<ArchiveDTO> listArchives();



    PageResult<ArticleAdminDTO> listArticlesAdmin(ConditionVO conditionVO);



    void saveOrUpdateArticle(ArticleVO articleVO);



    void updateArticleTopAndFeatured(ArticleTopFeaturedVO articleTopFeaturedVO);



    void updateArticleDelete(DeleteVO deleteVO);



    void deleteArticles(List<Integer> articleIds);



    ArticleAdminViewDTO getArticleByIdAdmin(Integer articleId);



    List<String> exportArticles(List<Integer> articleIdList);



    List<ArticleSearchDTO> listArticlesBySearch(ConditionVO condition);





}
