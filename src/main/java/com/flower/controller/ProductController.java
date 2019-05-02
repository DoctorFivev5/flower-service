package com.flower.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flower.dto.ResponseDto;
import com.flower.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/search")
    public String searchByWord(String key) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //判断传输的关键字是否为空
        if (!StringUtils.isEmpty(key)){
            return mapper.writeValueAsString(productService.searchByWord(key));
        }
        return mapper.writeValueAsString(new ResponseDto("200","搜索关键字不能为空"));
    }
    @RequestMapping(value = "/type")
    public String searchByType(String type) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //判断传输的关键字是否为空
        if (!StringUtils.isEmpty(type)){
            return mapper.writeValueAsString(productService.searchByType(type));
        }
        return mapper.writeValueAsString(new ResponseDto("200","类型不能为空"));
    }

    @RequestMapping(value = "/${id}")
    public String getOne(@PathVariable int id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        if (id!=0){
            return mapper.writeValueAsString(productService.findOne(id));
        }
        return mapper.writeValueAsString(new ResponseDto("200","id不能为0"));
    }
}
