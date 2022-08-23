package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * 
 * @TableName t_article
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value ="t_article")
@Data
@ApiModel(value = "文章")
public class Article  {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 作者
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 文章分类
     */
    @TableField(value = "category_id")
    private Integer categoryId;

    /**
     * 文章缩略图
     */
    @TableField(value = "article_cover")
    private String articleCover;

    /**
     * 标题
     */
    @TableField(value = "article_title")
    private String articleTitle;

    /**
     * 内容
     */
    @TableField(value = "article_content")
    private String articleContent;

    /**
     * 是否置顶 0否 1是
     */
    @TableField(value = "is_top")
    private Integer isTop;

    /**
     * 是否推荐 0否 1是
     */
    @TableField(value = "is_featured")
    private Integer isFeatured;

    /**
     * 是否删除  0否 1是
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 状态值 1公开 2私密 3草稿
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 文章类型 1原创 2转载 3翻译
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 原文链接
     */
    @TableField(value = "original_url")
    private String originalUrl;

    /**
     * 发表时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}