package com.terwergreen.plugins.admin.front;

import com.terwergreen.plugins.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器
 *
 * @author Terwer
 * @version 1.0
 * 2018/11/29 1:23
 **/
@Controller
@RequestMapping("${bugucms.web.admin-path}")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET)
    public String admin() {
        return "index";
    }
}
