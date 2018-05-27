package com.prato.cloud.web;

import com.prato.cloud.BaseController;
import com.prato.cloud.entity.Role;
import com.prato.cloud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: RoleController
 * @Description: TODO
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月13日
 *
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {
    @Autowired
    private RoleService roleService;

    /**
     * 通过ID查询角色信息
     *
     * @param id 角色ID
     * @return 角色信息
     */
    @GetMapping("/{id}")
    public Role role(@PathVariable Long id) {
        return roleService.findById(id);
    }

    /**
     * 获取角色列表
     *
     * @param deptId  部门ID
     * @return 角色列表
     */
    @GetMapping("/roleList/{deptId}")
    public List<Role> roleList(@PathVariable Integer deptId) {
        return roleService.findListByDeptId(deptId);
    }

}
