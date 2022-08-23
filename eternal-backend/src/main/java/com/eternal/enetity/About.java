package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @TableName t_about
 */
@TableName(value = "t_about")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class About {

//    @ApiModelProperty(value = "id", required = true)
//    @Column(name = "id", nullable = false, columnDefinition = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "content")
    @ApiModelProperty(value = "内容")
    private String content;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
}