package com.o0u0o.babytun.dao;

import com.o0u0o.babytun.entity.GoodsParam;

import java.util.List;

public interface GoodsParamDAO {
    public List<GoodsParam> findByGoodsId(Long goodsId);
}
