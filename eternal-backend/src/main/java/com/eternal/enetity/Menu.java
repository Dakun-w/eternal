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
 * @TableName t_menu
 */
@TableName(value ="t_menu")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu  {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 菜单路径
     */
    @TableField(value = "path")
    private String path;

    /**
     * 组件
     */
    @TableField(value = "component")
    private String component;

    /**
     * 菜单icon
     */
    @TableField(value = "icon")
    private String icon;

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
     * 排序
     */
    @TableField(value = "order_num")
    private Integer orderNum;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 是否隐藏  0否1是
     */
    @TableField(value = "is_hidden")
    private Integer isHidden;



}