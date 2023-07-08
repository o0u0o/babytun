package com.o0u0o.babytun.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <h1>商品封面对象/h1>
 * ClassName: GoodsCover
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 4:54 PM
 */
@Getter
@Setter
@ApiModel(value = "商品封面对象(GoodsCover)")
public class GoodsCover implements Serializable {

    @ApiModelProperty(value = "商品封面ID")
    private Long gcId;

    @ApiModelProperty(value = "商品ID")
    private Long goodsId;

    @ApiModelProperty(value = "封面图片URL")
    private String gcPicUrl;

    @ApiModelProperty(value = "缩略图URL")
    private String gcThumbUrl;

    @ApiModelProperty(value = "图片排序")
    private Long gcOrder;
}
