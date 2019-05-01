package com.imooc.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Process
 *
 * @version 1.0
 */
@Getter
@Setter
public class Area {
    //ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
