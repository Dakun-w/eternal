package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 相册
 * @TableName t_photo_album
 */
@TableName(value ="t_photo_album")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "相册")
public class PhotoAlbum  {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 相册名
     */
    @TableField(value = "album_name")
    private String albumName;

    /**
     * 相册描述
     */
    @TableField(value = "album_desc")
    private String albumDesc;

    /**
     * 相册封面
     */
    @TableField(value = "album_cover")
    private String albumCover;

    /**
     * 是否删除
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 状态值 1公开 2私密
     */
    @TableField(value = "status")
    private Integer status;

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