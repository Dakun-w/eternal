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
 * @TableName t_user_auth
 */
@TableName(value ="t_user_auth")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAuth  {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户信息id
     */
    @TableField(value = "user_info_id")
    private Integer userInfoId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 登录类型
     */
    @TableField(value = "login_type")
    private Integer loginType;

    /**
     * 用户登录ip
     */
    @TableField(value = "ip_address")
    private String ipAddress;

    /**
     * ip来源
     */
    @TableField(value = "ip_source")
    private String ipSource;

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

    /**
     * 上次登录时间
     */
    @TableField(value = "last_login_time")
    private LocalDateTime lastLoginTime;



}