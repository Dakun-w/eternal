package com.eternal.dto;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "文章编辑页码DTO")
public class ArticleAdminViewDTO {
    private Integer id;
    private String articleTitle;
    private String articleContent;
    private String articleCover;
    private String categoryName;
    private List<String> tagNames;
    private Integer isTop;
    private Integer isFeatured;
    private Integer status;
    private Integer type;
    private String originalUrl;
}
