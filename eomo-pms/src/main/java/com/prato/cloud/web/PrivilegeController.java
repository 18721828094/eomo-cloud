package com.prato.cloud.web;

import com.prato.cloud.BaseController;
import com.prato.cloud.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PrivilegeController
 * @Description: TODO
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月13日
 *
 */
@RestController
@RequestMapping("/privilege")
public class PrivilegeController extends BaseController {
    @Autowired
    private PrivilegeService privilegeService;
}
