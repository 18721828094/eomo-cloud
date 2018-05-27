package com.prato.cloud.repository;

import com.prato.cloud.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: RoleRepository
 * @Description: 角色Dao数据持久层操作接口
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月2日
 * 
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
