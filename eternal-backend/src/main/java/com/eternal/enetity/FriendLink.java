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
 * @TableName t_friend_link
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value ="t_friend_link")
public class FriendLink  {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 链接名
     */
    @TableField(value = "link_name")
    private String linkName;

    /**
     * 链接头像
     */
    @TableField(value = "link_avatar")
    private String linkAvatar;

    /**
     * 链接地址
     */
    @TableField(value = "link_address")
    private String linkAddress;

    /**
     * 链接介绍
     */
    @TableField(value = "link_intro")
    private String linkIntro;

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