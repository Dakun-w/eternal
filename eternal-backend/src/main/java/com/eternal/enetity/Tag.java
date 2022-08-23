package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.NamedEntityGraph;

/**
 * 
 * @TableName t_tag
 */
@TableName(value ="t_tag")
@Data
@Builder
@NamedEntityGraph
@AllArgsConstructor
public class Tag  {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名
     */
    @TableField(value = "tag_name")
    private String tagName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.DEFAULT)
    private LocalDateTime updateTime;



}