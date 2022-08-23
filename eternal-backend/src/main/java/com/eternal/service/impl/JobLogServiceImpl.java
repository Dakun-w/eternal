package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.JobLog;
import com.eternal.service.JobLogService;
import com.eternal.mapper.JobLogMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_job_log(定时任务调度日志表)】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class JobLogServiceImpl extends ServiceImpl<JobLogMapper, JobLog>
    implements JobLogService{

}




