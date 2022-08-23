package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.WebsiteConfig;
import com.eternal.mapper.WebsiteConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_website_config】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class WebsiteConfigServiceImpl extends ServiceImpl<WebsiteConfigMapper, WebsiteConfig>
    implements IService<WebsiteConfig> {

}




