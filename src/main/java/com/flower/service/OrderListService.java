package com.flower.service;

import com.flower.dto.ResponseDto;

public interface OrderListService {
    ResponseDto getOrderListByOrderId(Integer orderId);
}
