package com.tyn.blog.dao.jpa;

import com.tyn.blog.po.jpa.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import java.util.List;

/**
 * @author wanglei
 * @Description todo
 * @date 2019/11/15 0015 下午 15:21
 */
public interface UserRepository extends Repository<User,Integer> {

    // 注意点：这种写法语句中 SysUsers 必须是和实体类名称一样 不能是数据里的表名称（sys_users）
    // 底层会对HQL语句就行转换,这种方法nativeQuery默认为false
    //?1表示占位符，要与参数对应
    @Query("from User where name = ?1 ")
    List<User> QueryByNameHQL(String name);

    // 注意点：nativeQuery= true 说明这的语句就是正常的SQL语句，底层不会对改语句进行转换
    @Query(value = "select * from s_user where name = ?", nativeQuery = true)
    List<User> QueryByNameSQL(String name);

    @Query("update User set name = ?1 where id = ?1")
    @Modifying
        // 需要加上@Modifying Annotation
    void UpdateUserNameById(String name, Integer id);

}
