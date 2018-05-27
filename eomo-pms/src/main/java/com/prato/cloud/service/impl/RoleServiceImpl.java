package com.prato.cloud.service.impl;

import com.prato.cloud.entity.Role;
import com.prato.cloud.repository.RoleRepository;
import com.prato.cloud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 角色Service层接口实现类
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role findByRoleId(Long id) {
		return roleRepository.getOne(id);
	}

	@Override
	public void save(Role role) {
		roleRepository.save(role);
	}

	/**
	 * 查询所有角色
	 *
	 * @return
	 */
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Map<String, Object>> findByUserId(Long userId) {
		//1、查出所有角色
		List<Role> list=roleRepository.findAll();
		//2、查出指定用户id的角色
		Set<Role> listOne= userRepository.getOne(userId).getRoles();
	}

	@Override
	public List<Role> findListByDeptId(Integer deptId) {
		return null;
	}
}
