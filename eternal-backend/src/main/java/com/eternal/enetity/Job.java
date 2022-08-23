package com.eternal.enetity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 定时任务调度表
 * @TableName t_job
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_job")
public class Job {
    /**
     * 任务ID
     */
    @ApiModelProperty(value = "任务ID")
    private Integer id;

    @ApiModelProperty(value = "任务名称")
    private String jobName;

    @ApiModelProperty(value = "任务组名")
    private String jobGroup;

    @ApiModelProperty(value = "调用目标字符串")
    private String invokeTarget;

    @ApiModelProperty(value = "cron执行表达式")
    private String cronExpression;

    @ApiModelProperty(value = "计划执行错误策略（1立即执行 2执行一次 3放弃执行）")
    private Integer misfirePolicy;

    @ApiModelProperty(value = "是否并发执行（0允许 1禁止）")
    private Integer concurrent;

    @ApiModelProperty(value = "     * 状态（0正常 1暂停）\n")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "备注信息")
    private String remark;

    @TableField(exist = false)
    private Date nextValidTime;


}