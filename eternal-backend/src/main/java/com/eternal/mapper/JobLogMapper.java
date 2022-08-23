package com.eternal.mapper;

import com.eternal.enetity.JobLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author xiao
* @description 针对表【t_job_log(定时任务调度日志表)】的数据库操作Mapper
* @createDate 2022-08-23 14:46:40
* @Entity com.eternal.enetity.JobLog
*/
@Repository
public interface JobLogMapper extends BaseMapper<JobLog> {

}




