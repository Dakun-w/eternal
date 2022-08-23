package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName t_comment
 */
@TableName(value ="t_comment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment  {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论用户Id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 评论主题id
     */
    @TableField(value = "topic_id")
    private Integer topicId;

    /**
     * 评论内容
     */
    @TableField(value = "comment_content")
    private String commentContent;

    /**
     * 回复用户id
     */
    @TableField(value = "reply_user_id")
    private Integer replyUserId;

    /**
     * 父评论id
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 评论类型 1.文章 2.留言 3.友链 4.关于我 5.说说
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 是否删除  0否 1是
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 是否审核
     */
    @TableField(value = "is_review")
    private Integer isReview;

    /**
     * 评论时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}