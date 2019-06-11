package com.flower.service;

import com.flower.dto.OrderQuery;
import com.flower.dto.ResponseDto;

public interface OrderService {
    ResponseDto getOrderByType(OrderQuery orderQuery);
    ResponseDto deleteOrderById(Integer orderId);
}
