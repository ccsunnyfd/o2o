package com.imooc.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * Process
 *
 * @version 1.0
 */
@Getter
@Setter
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    //简略图
    private String imgAddr;
    private String normalPrice;
    private String promotionPrice;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //-1.不可用 0.下架 1.在前端展示系统展示
    private Integer enableStatus;

    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;
}
