package com.tyn.blog.entity.common;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column(name = "id")
    private int id;

    @Column(name = "user_id",insertable = false,updatable = false)
    private int userId;
}
