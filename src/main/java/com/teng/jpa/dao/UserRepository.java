package com.teng.jpa.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.teng.jpa.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * T: 当前需要映射的实体
 * ID: 当前需要映射的id类型
 */
public interface UserRepository extends JpaRepository<Users, ID> {
}
