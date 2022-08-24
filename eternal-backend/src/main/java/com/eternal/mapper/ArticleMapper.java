package com.eternal.mapper;

import com.eternal.dto.ArticleAdminDTO;
import com.eternal.dto.ArticleCardDTO;
import com.eternal.dto.ArticleDTO;
import com.eternal.dto.ArticleStatisticsDTO;
import com.eternal.enetity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eternal.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author xiao
* @description 针对表【t_article】的数据库操作Mapper
* @createDate 2022-08-23 14:46:39
* @Entity com.eternal.enetity.Article
*/
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    /**
     * 查询列表信息
     * @return
     */
    @Select("SELECT a.id AS id, category_id, article_cover, article_title, article_content, is_top, is_featured, " +
            "a.create_time AS create_time, a.update_time AS update_time, u.nickname AS author_nickname, " +
            "u.website AS author_website, u.avatar AS author_avatar, c.category_name AS category_name, " +
            "tag_name FROM ( SELECT id, user_id, category_id, article_cover, article_title, article_content, " +
            "is_top, is_featured, is_delete, status, create_time, update_time FROM t_article ) a LEFT JOIN t_article_tag at ON a.id = at.article_id" +
            " LEFT JOIN t_tag t ON t.id = at.tag_id LEFT JOIN t_category c ON a.category_id = c.id LEFT JOIN t_user_info u ON a.user_id = u.id where a.is_delete = 0 and a.status = 1 " +
            "order by is_top desc, is_featured desc")
    List<ArticleCardDTO> listTopAndFeaturedArticles();

    /**
     * 查询分页信息
     * @param current 当前页
     * @param size  页码
     * @return
     */
    @Select("SELECT a.id AS id, article_cover, article_title, article_content, is_top, is_featured, " +
            "a.create_time AS create_time, a.update_time AS update_time, u.nickname AS author_nickname, " +
            "u.website AS author_website, u.avatar AS author_avatar, c.category_name AS category_name, " +
            "tag_name FROM ( SELECT id, user_id, category_id, article_cover, article_title, article_content, " +
            "is_top, is_featured, is_delete, status, create_time, update_time FROM t_article where is_delete=0 and status=1 limit #{current},#{size}) a LEFT JOIN t_article_tag at ON a.id = at.article_id" +
            "LEFT JOIN t_tag t ON t.id = at.tag_id " +
            "LEFT JOIN t_category c ON a.category_id = c.id " +
            "LEFT JOIN t_user_info u ON a.user_id = u.id")
    List<ArticleCardDTO> listArticles(@Param("current") Long current, @Param("size") Long size);


    /**
     * 根据categoryId查询展示分页
     * @param current
     * @param size
     * @param categoryId
     * @return
     */
    @Select("SELECT a.id AS id,article_cover,article_title,article_content,is_top,is_featured," +
            "a.create_time AS create_time, a.update_time AS update_time, u.nickname AS author_nickname," +
            "u.website AS author_website, u.avatar AS author_avatar, c.category_name AS category_name," +
            "tag_name FROM (SELECT id, user_id, category_id, article_cover, article_title, article_content," +
            "is_top, is_featured, is_delete, status, create_time, update_time FROM t_article WHERE category_id = #{categoryId} AND is_delete=0 AND status=1 limit #{current},#{size}) a LEFT JOIN t_article_tag at ON a.id = at.article_id" +
            "LEFT JOIN t_tag t ON t.id = AT.tag_id" +
            "LEFT JOIN t_category c ON a.category_id = c.id" +
            "LEFT JOIN t_user_info u ON a.user_id = u.id")
    List<ArticleCardDTO> getArticlesByCategoryId(@Param("current") Long current, @Param("size") Long size, @Param("categoryId") Integer categoryId);


    /**
     *
     * @param articleId
     * @return
     */
    @Select("SELECT a.id AS id ,article_cover,article_title,article_content,is_top,is_featured,type,original_url," +
            "a.create_time AS create_time, a.update_time AS update_time, u.nickname AS author_nickname," +
            "u.website AS author_website, u.avatar AS author_avatar,c.category_name AS category_name," +
            "tag_name FROM (SELECT id, user_id, category_id, article_cover, article_title, article_content" +
            "is_top, is_featured, is_delete, status,type,original_url, create_time, update_time FROM t_article WHERE id=#{articleId} AND is_delete=0 AND status=1) a LEFT JOIN t_article_tag AT ON a.id = AT.article_id" +
            "LEFT JOIN t_tag t ON t.id = AT.tag_id" +
            "LEFT JOIN t_category c ON a.category_id = c.id" +
            "LEFT JOIN t_user_info u ON a.user_id = u.id")
    ArticleDTO getArticleById(@Param("articleId") Integer articleId);







    ArticleCardDTO getPreArticleById(@Param("articleId") Integer articleId);

    ArticleCardDTO getNextArticleById(@Param("articleId") Integer articleId);

    ArticleCardDTO getFirstArticle();

    ArticleCardDTO getLastArticle();

    List<ArticleCardDTO> listArticlesByTagId(@Param("current") Long current, @Param("size") Long size, @Param("tagId") Integer tagId);

    List<ArticleCardDTO> listArchives(@Param("current") Long current, @Param("size") Long size);

    Integer countArticleAdmins(@Param("conditionVO") ConditionVO conditionVO);

    List<ArticleAdminDTO> listArticlesAdmin(@Param("current") Long current, @Param("size") Long size, @Param("conditionVO") ConditionVO conditionVO);

    List<ArticleStatisticsDTO> listArticleStatistics();






}




