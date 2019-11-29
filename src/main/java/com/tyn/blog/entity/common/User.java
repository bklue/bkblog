package com.tyn.blog.entity.common;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author wanglei
 * @Description todo
 * @date 2019/11/15 0015 下午 14:36
 */
@Data
@Entity
@Table(name = "s_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;


//    @OneToMany(cascade = CascadeType.PERSIST,targetEntity = Role.class,fetch = FetchType.LAZY)	//联级保存(all,删除可选)
//    @JoinColumn(name ="user_id",nullable = false,referencedColumnName = "id")	//维护一个外键，外键在User一侧
//    private List<Role> role;

    @Column(name = "create_time")
    private Date createTime ;

    @Column(name = "update_time")
    private Date updateTime;

}
