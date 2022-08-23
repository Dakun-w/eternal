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
 * @TableName t_role_menu
 */
@TableName(value ="t_role_menu")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenu  {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 菜单id
     */
    @TableField(value = "menu_id")
    private Integer menuId;



}