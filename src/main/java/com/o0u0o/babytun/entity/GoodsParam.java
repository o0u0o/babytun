package com.o0u0o.babytun.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <h1>商品参数对象</h1>
 * ClassName: GoodsParam
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 4:58 PM
 */
@Getter
@Setter
@ApiModel(value = "商品参数对象(GoodsParam)")
public class GoodsParam implements Serializable {
    @ApiModelProperty(value = "商品参数ID")
    private Long gpId;

    @ApiModelProperty(value = "商品参数名称")
    private String gpParamName;

    @ApiModelProperty(value = "商品参数值")
    private String gpParamValue;

    @ApiModelProperty(value = "商品ID")
    private Long goodsId;

    @ApiModelProperty(value = "商品参数排序")
    private Integer gpOrder;
}
