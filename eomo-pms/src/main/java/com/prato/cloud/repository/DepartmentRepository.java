package com.prato.cloud.repository;

import com.prato.cloud.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DepartmentRepository
 * @Description: 部门Dao数据持久层操作接口
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月2日
 * 
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Dept, Long> {
    List<Dept> findAll();
}
