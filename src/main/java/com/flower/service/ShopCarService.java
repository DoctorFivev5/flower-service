package com.flower.service;

import com.flower.bean.ShopCar;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface ShopCarService {
    ResponseDto addShopcar(ShopCar shopCar);
}
