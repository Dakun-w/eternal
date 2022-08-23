package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 照片
 * @TableName t_photo
 */
@TableName(value ="t_photo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Photo   {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 相册id
     */
    @TableField(value = "album_id")
    private Integer albumId;

    /**
     * 照片名
     */
    @TableField(value = "photo_name")
    private String photoName;

    /**
     * 照片描述
     */
    @TableField(value = "photo_desc")
    private String photoDesc;

    /**
     * 照片地址
     */
    @TableField(value = "photo_src")
    private String photoSrc;

    /**
     * 是否删除
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

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