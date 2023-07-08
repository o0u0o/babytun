package com.o0u0o.babytun.dao;


import com.o0u0o.babytun.entity.GoodsCover;

import java.util.List;

public interface GoodsCoverDAO {
    public List<GoodsCover> findByGoodsId(Long goodsId);
}
