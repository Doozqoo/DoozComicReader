package com.dooz.service.impl;

import com.dooz.domain.ResponseResult;
import com.dooz.domain.entity.Category;
import com.dooz.domain.vo.CategoryVo;
import com.dooz.enums.HttpStatus;
import com.dooz.mapper.CategoryMapper;
import com.dooz.service.CategoryService;
import com.dooz.utils.BeanCopyUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Ayachi Nene
* @description 针对表【category(分类)】的数据库操作Service实现
* @createDate 2023-07-14 22:26:32
*/
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private CategoryMapper categoryMapper;

    @Override
    public ResponseResult getCategoryList() {
        List<Category> categories = categoryMapper.categoryList();
        List<CategoryVo> categoryVos = BeanCopyUtil.beansCopy(categories, CategoryVo.class);
        return ResponseResult.builder(HttpStatus.OK, categoryVos);
    }
}




