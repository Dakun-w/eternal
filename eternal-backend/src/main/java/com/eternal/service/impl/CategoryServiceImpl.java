package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Category;
import com.eternal.service.CategoryService;
import com.eternal.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_category】的数据库操作Service实现
* @createDate 2022-08-23 14:46:39
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




