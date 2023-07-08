package com.o0u0o.babytun.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <h1>商品对象</h1>
 * ClassName: Goods
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 3:18 PM
 */
@Getter
@Setter
@ApiModel(value = "商品对象(Goods)")
public class Goods implements Serializable {

    @ApiModelProperty(value = "商品ID")
    private Long goodsId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "子标题")
    private String subTitle;

    @ApiModelProperty(value = "原价")
    private Float originalCost;

    @ApiModelProperty(value = "折扣价")
    private Float currentPrice;

    @ApiModelProperty(value = "折扣")
    private Float discount;

    @ApiModelProperty(value = "销量")
    private Integer isFreeDelivery;

    @ApiModelProperty(value = "分类ID")
    private Long categoryId;
}
