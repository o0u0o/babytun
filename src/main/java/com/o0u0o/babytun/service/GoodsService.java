package com.o0u0o.babytun.service;

import com.o0u0o.babytun.dao.GoodsCoverDAO;
import com.o0u0o.babytun.dao.GoodsDAO;
import com.o0u0o.babytun.dao.GoodsDetailDAO;
import com.o0u0o.babytun.dao.GoodsParamDAO;
import com.o0u0o.babytun.entity.Goods;
import com.o0u0o.babytun.entity.GoodsCover;
import com.o0u0o.babytun.entity.GoodsDetail;
import com.o0u0o.babytun.entity.GoodsParam;
import org.springframework.cache.annotation.Cacheable;
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

    /**
     * 注解@Cacheable，是声明式缓存的核心注解
     * 第一次访问的时候将方法的返回值缓存起来，下次访问直接从缓存中获取
     * @param goodsId
     * @return
     */
    @Cacheable(value = "goods", key = "#goodsId")
    public Goods getGoods(Long goodsId) {
        return goodsDAO.findById(goodsId);
    }

    @Cacheable(value = "covers", key = "#goodsId")
    public List<GoodsCover> findCovers(Long goodsId){
        return goodsCoverDAO.findByGoodsId(goodsId);
    }

    @Cacheable(value = "details", key = "#goodsId")
    public List<GoodsDetail> findDetails(Long goodsId){
        return  goodsDetailDAO.findByGoodsId(goodsId);
    }

    @Cacheable(value = "params", key = "#goodsId")
    public List<GoodsParam> findParams(Long goodsId){
        List list =  goodsParamDAO.findByGoodsId(goodsId);
        return list;
    }
}
