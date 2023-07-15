package com.dooz.controller;

import com.dooz.domain.ResponseResult;
import com.dooz.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/client-comic/category")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/list")
    public ResponseResult getCategoryList(){
        return categoryService.getCategoryList();
    }
}
