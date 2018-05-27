package com.prato.cloud.service;

import com.prato.cloud.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: RoleService
 * @Description: TODO
 * @date 2018年4月10日
 */
public interface RoleService {
    /**
     * 根据角色id查找角色信息
     * @param id
     * @return
     */
    public Role findByRoleId(Long id);

    /**
     * 保存角色信息
     * @param role
     */
    public void save(Role role);

    public List<Role> findAll();

    List<Map<String, Object>> findByUserId(Long userId);

    public List<Role> findListByDeptId(Integer deptId);
}
