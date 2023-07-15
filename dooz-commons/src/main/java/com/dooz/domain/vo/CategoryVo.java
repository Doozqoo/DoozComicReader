package com.dooz.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryVo {

    /**
     * 分类id
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类id,如果没有父分类默认-1
     */
    private Long pid;

    /**
     * 状态（0表示正常 1表示封印）
     */
    private String status;

    /**
     *
     */
    private Long createBy;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Long updateBy;

    /**
     *
     */
    private Date updateTime;

}
