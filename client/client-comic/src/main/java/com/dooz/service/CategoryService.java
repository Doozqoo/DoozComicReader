package com.dooz.service;

import com.dooz.domain.ResponseResult;

/**
* @author Ayachi Nene
* @description 针对表【category(分类)】的数据库操作Service
* @createDate 2023-07-14 22:26:32
*/
public interface CategoryService {

    ResponseResult getCategoryList();
}
