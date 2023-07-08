package com.o0u0o.babytun.service;

import com.o0u0o.babytun.dao.GoodsCoverDAO;
import com.o0u0o.babytun.dao.GoodsDAO;
import com.o0u0o.babytun.dao.GoodsDetailDAO;
import com.o0u0o.babytun.dao.GoodsParamDAO;
import com.o0u0o.babytun.entity.Goods;
import com.o0u0o.babytun.entity.GoodsCover;
import com.o0u0o.babytun.entity.GoodsDetail;
import com.o0u0o.babytun.entity.GoodsParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h1></h1>
 * ClassName: GoodsService
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 5:00 PM
 */

@Service
public class GoodsService {
    @Resource
    private GoodsDAO goodsDAO;
    @Resource
    private GoodsCoverDAO goodsCoverDAO;
    @Resource
    private GoodsDetailDAO goodsDetailDAO;
    @Resource
    private GoodsParamDAO goodsParamDAO;
    //view -> controller -> service -> dao
    public Goods getGoods(Long goodsId) {
        return goodsDAO.findById(goodsId);
    }

    public List<GoodsCover> findCovers(Long goodsId){
        return goodsCoverDAO.findByGoodsId(goodsId);
    }

    public List<GoodsDetail> findDetails(Long goodsId){
        return  goodsDetailDAO.findByGoodsId(goodsId);
    }

    public List<GoodsParam> findParams(Long goodsId){
        List list =  goodsParamDAO.findByGoodsId(goodsId);
        return list;
    }
}
