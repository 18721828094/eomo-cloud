package com.prato.cloud.web;

import com.prato.cloud.BaseController;
import com.prato.cloud.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController extends BaseController {
    @Autowired
    private LogService logService;
}
