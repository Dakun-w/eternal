package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.OperationLog;
import com.eternal.service.OperationLogService;
import com.eternal.mapper.OperationLogMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_operation_log】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog>
    implements OperationLogService{

}




