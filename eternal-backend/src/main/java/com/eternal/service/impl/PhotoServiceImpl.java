package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Photo;
import com.eternal.service.PhotoService;
import com.eternal.mapper.PhotoMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_photo(照片)】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo>
    implements PhotoService{

}




