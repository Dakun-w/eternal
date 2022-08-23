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
 * @author xiao
 * @TableName t_unique_view
 */
@TableName(value ="t_unique_view")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UniqueView  {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 访问量
     */
    @TableField(value = "views_count")
    private Integer viewsCount;

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