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
 * @TableName t_user_info
 */
@TableName(value ="t_user_info")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo  {
    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 邮箱号
     */
    @TableField(value = "email")
    private String email;

    /**
     * 用户昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 用户头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 用户简介
     */
    @TableField(value = "intro")
    private String intro;

    /**
     * 个人网站
     */
    @TableField(value = "website")
    private String website;

    /**
     * 是否订阅
     */
    @TableField(value = "is_subscribe")
    private Integer isSubscribe;

    /**
     * 是否禁用
     */
    @TableField(value = "is_disable")
    private Integer isDisable;

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