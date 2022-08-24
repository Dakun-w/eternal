package com.eternal.dto;


import com.eternal.enetity.Tag;
import com.eternal.enetity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleCardDTO {
    private Integer id;
    private String articleCover;
    private String articleTitle;
    private String articleContent;
    private Integer isTop;
    private Integer isFeatured;
    private UserInfo author;
    private String categoryName;
    private List<Tag> tags;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
