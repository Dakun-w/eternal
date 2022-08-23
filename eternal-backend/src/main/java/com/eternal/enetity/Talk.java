package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.google.common.annotations.Beta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.NamedEntityGraph;

/**
 * 
 * @TableName t_talk
 */
@TableName(value ="t_talk")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Talk  {
    /**
     * 说说id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 说说内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 图片
     */
    @TableField(value = "images")
    private String images;

    /**
     * 是否置顶
     */
    @TableField(value = "is_top")
    private Integer isTop;

    /**
     * 状态 1.公开 2.私密
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;



}