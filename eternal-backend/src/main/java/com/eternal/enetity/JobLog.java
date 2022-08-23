package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 定时任务调度日志表
 * @author xiao
 * @TableName t_job_log
 */
@TableName(value ="t_job_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobLog  {

    @ApiModelProperty(value = "任务日志ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务ID")
    private Integer jobId;

    @ApiModelProperty(value = "任务名称")
    private String jobName;

    @ApiModelProperty(value = "任务组名")
    private String jobGroup;

    @ApiModelProperty(value = "调用目标字符串")
    private String invokeTarget;

    @ApiModelProperty(value = "日志信息")
    private String jobMessage;

    @ApiModelProperty(value = "执行状态（0正常 1失败）")
    private Integer status;

    @ApiModelProperty(value = "异常信息")
    private String exceptionInfo;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;


}