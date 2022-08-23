package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName t_article_tag
 */
@TableName(value ="t_article_tag")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTag {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文章id
     */
    @TableField(value = "article_id")
    private Integer articleId;

    /**
     * 标签id
     */
    @TableField(value = "tag_id")
    private Integer tagId;

}