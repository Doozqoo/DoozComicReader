package com.dooz.mapper;

import com.dooz.domain.entity.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Ayachi Nene
* @description 针对表【category(分类)】的数据库操作Mapper
* @createDate 2023-07-14 22:26:32
* @Entity com.dooz.domain.entity.Category
*/
@Repository
public interface CategoryMapper {

    @Select("SELECT * FROM `dooz-client_comic`.category")
    List<Category> categoryList();
}




