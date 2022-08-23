package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Menu;
import com.eternal.service.MenuService;
import com.eternal.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_menu】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

}




