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
 * @TableName t_resource
 */
@TableName(value ="t_resource")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resource  {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 资源名
     */
    @TableField(value = "resource_name")
    private String resourceName;

    /**
     * 权限路径
     */
    @TableField(value = "url")
    private String url;

    /**
     * 请求方式
     */
    @TableField(value = "request_method")
    private String requestMethod;

    /**
     * 父模块id
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 是否匿名访问 0否 1是
     */
    @TableField(value = "is_anonymous")
    private Integer isAnonymous;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;



}