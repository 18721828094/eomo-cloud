package com.prato.cloud.repository;

import com.prato.cloud.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: PrivilegeRepository
 * @Description: 权限Dao数据持久层操作接口
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月2日
 * 
 */
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    public List<Privilege> findAll();

    public List<Privilege> findByUserId(Long userId);
}
