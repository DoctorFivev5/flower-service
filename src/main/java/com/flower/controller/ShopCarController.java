package com.flower.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flower.bean.ShopCar;
import com.flower.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarService shopCarService;

    //添加购物车
    @RequestMapping(value = "/shopCar/addShopCar")
    public String addShopcar(ShopCar shopCar) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(shopCarService.addShopcar(shopCar));
    }
    //移除购物车

    //修改购物车

    //查找购物车
}
