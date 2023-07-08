package com.o0u0o.babytun.controller;

import com.o0u0o.babytun.entity.Goods;
import com.o0u0o.babytun.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <h1></h1>
 * ClassName: GoodsController
 * Description:
 *
 * @Author o0u0o
 * @Date 2023/7/8 2:40 PM
 */
@Slf4j
@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("/goods")
    public ModelAndView showGoods(Long gid){
        log.info("gid:{}", gid);
        ModelAndView mav = new ModelAndView("/goods");
        Goods goods = goodsService.getGoods(gid);
        mav.addObject("goods", goods);
        mav.addObject("covers", goodsService.findCovers(gid));
        mav.addObject("details", goodsService.findDetails(gid));
        mav.addObject("params", goodsService.findParams(gid));
        return mav;
    }
}
