package com.flower.service;

import com.flower.bean.User;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ResponseDto login(User user);
}
