package com.tyn.blog.entity.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangl
 * @Description todo
 * @date 12/18/2019 2:55 PM
 */
@Data
@ApiModel
public class Hero {
    @ApiModelProperty(value ="英雄名字",required = true)
    private String name;

    @ApiModelProperty(value = "英雄技能")
    private String skill;

    @ApiModelProperty(value = "位置")
    private String position;

    @ApiModelProperty(hidden = true)
    private String sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;
}
