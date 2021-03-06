package org.nero.click.sso.dao;

import org.apache.ibatis.annotations.Param;
import org.nero.click.sso.entity.User;

/**
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-10-1
 * time: 下午2:13.
 */
public interface UserDao {


    int add(@Param("username") String username,
            @Param("password") String password,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("token") String token);

    int update(@Param("id") long id,
               @Param("username") String username,
               @Param("password") String password,
               @Param("email") String email,
               @Param("phone") String phone,
               @Param("token") String token,
               @Param("time") java.sql.Timestamp time);

    int active(@Param("id") long id);

    User query(@Param("id") long id);

    User queryByToken(@Param("token") String token);

    User queryByEmail(@Param("email") String email);
}
