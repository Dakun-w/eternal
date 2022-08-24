package com.eternal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "文章排行")
public class ArticleRankDTO {

    @ApiModelProperty(value = "标题")
    private String articleTitle;


    @ApiModelProperty(value = "浏览量")
    private Integer viewsCount;


}
