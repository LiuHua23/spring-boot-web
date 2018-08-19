package com.hwa.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Dao
 * @author LiuHua
 * @date 2018/7/3
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName, String email);
}
