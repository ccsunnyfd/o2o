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
public class ProductCategory {
    private Long productCateogryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;
    private Date createTime;
}
