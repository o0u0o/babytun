package com.o0u0o.babytun.dao;

import com.o0u0o.babytun.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailDAO {
    public List<GoodsDetail> findByGoodsId(Long goodsId);
}
