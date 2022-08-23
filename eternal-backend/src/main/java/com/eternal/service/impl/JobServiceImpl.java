package com.eternal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.enetity.Job;
import com.eternal.service.JobService;
import com.eternal.mapper.JobMapper;
import org.springframework.stereotype.Service;

/**
* @author xiao
* @description 针对表【t_job(定时任务调度表)】的数据库操作Service实现
* @createDate 2022-08-23 14:46:40
*/
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job>
    implements JobService{

}




