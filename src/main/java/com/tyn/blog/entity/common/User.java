package com.tyn.blog.entity.common;

import lombok.Data;

import javax.persistence.*;
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

    private String name;

    private String account;

    @Column(name = "user_id")
    @OneToMany(cascade = CascadeType.PERSIST,targetEntity = Role.class,fetch = FetchType.LAZY)	//联级保存(all,删除可选)
    @JoinColumn(name ="user_id",nullable = false,referencedColumnName = "id")	//维护一个外键，外键在User一侧
    private List<Role> role;

}
