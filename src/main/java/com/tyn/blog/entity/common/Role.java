package com.tyn.blog.entity.common;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wanglei
 * @Description todo
 * @date 2019/11/15 0015 下午 14:43
 */
@Data
@Entity
@Table(name = "s_role")
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @Column(name = "user_id",insertable = false,updatable = false)
//    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "create_time")
    private Date createTime ;

    @Column(name = "update_time")
    private Date updateTime;
}
