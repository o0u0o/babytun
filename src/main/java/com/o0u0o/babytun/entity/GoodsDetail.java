package com.o0u0o.babytun.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <h1>商品详情对象</h1>
 * ClassName: GoodsDetail
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 4:56 PM
 */
@Getter
@Setter
@ApiModel(value = "商品详情对象(GoodsDetail)")
public class GoodsDetail implements Serializable {

    @ApiModelProperty(value = "商品详情ID")
    private Long gdId;

    @ApiModelProperty(value = "商品ID")
    private Long goodsId;

    @ApiModelProperty(value = "商品详情图片URL")
    private String gdPicUrl;

    @ApiModelProperty(value = "商品详情排序")
    private Integer gdOrder;
}
