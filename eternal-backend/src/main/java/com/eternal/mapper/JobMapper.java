package com.eternal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eternal.enetity.Job;
import org.springframework.stereotype.Repository;

/**
* @author xiao
* @description 针对表【t_job(定时任务调度表)】的数据库操作Mapper
* @createDate 2022-08-23 14:46:40
* @Entity com.eternal.enetity.Job
*/
@Repository
public interface JobMapper extends BaseMapper<Job> {

}




