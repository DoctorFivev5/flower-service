package com.flower.service;

import com.flower.bean.Comment;
import com.flower.dto.ResponseDto;

public interface CommentService {
    ResponseDto evaluate(Comment comment);
}
