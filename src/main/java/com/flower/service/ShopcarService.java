package com.flower.service;

import com.flower.bean.ShopCar;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface ShopcarService {
    ResponseDto addShopcar(ShopCar shopCar);
}
