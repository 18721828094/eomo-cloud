package com.prato.cloud.web;

import com.prato.cloud.BaseController;
import com.prato.cloud.entity.Dept;
import com.prato.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController extends BaseController {
    @Autowired
    private DeptService deptService;

    /**
     * 通过部门ID查询
     * @param id 部门ID
     * @return
     */
    @GetMapping("/{id}")
    public Dept findById(@PathVariable Integer id) {
        return deptService.findById(id);
    }
}
