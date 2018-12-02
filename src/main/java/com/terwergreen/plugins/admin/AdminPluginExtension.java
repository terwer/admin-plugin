package com.terwergreen.plugins.admin;

import com.terwergreen.core.CommonService;
import com.terwergreen.plugins.PluginInterface;
import com.terwergreen.plugins.admin.front.AdminApi;
import com.terwergreen.plugins.admin.front.AdminController;
import com.terwergreen.plugins.admin.service.impl.AdminServiceImpl;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.reactive.function.server.RouterFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Terwer
 * @Date 2018/11/27 16:03
 * @Version 1.0
 * @Description 扩展点
 **/
@Extension
public class AdminPluginExtension implements PluginInterface {
    private static final Logger logger = LoggerFactory.getLogger(AdminPluginExtension.class);
    private GenericApplicationContext applicationContext;

    @Autowired
    private AdminApi adminApi;

    @Autowired
    private CommonService commonService;

    public AdminPluginExtension(GenericApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        logger.info("AdminPluginExtension contructor");
        // 注册插件依赖
        registerBeans();
    }

    private void registerBeans() {
        applicationContext.registerBean(AdminController.class);
        logger.info("AdminPluginExtension registerBean " + AdminController.class + " in applicationContext " + applicationContext);
        applicationContext.registerBean(AdminApi.class);
        logger.info("AdminPluginExtension registerBean " + AdminApi.class + " in applicationContext " + applicationContext);
        applicationContext.registerBean(AdminServiceImpl.class);
        logger.info("AdminPluginExtension registerBean " + AdminServiceImpl.class + " in applicationContext " + applicationContext);
    }

    @Override
    public String identify() {
        return "AdminPlugin identify in plugin,theme is:" + commonService.getSiteConfig("webtheme");
    }

    @Override
    public List<?> reactiveRoutes() {
        return new ArrayList<RouterFunction<?>>() {{
            add(adminApi.adminApi());
            add(adminApi.adminInfoApi());
        }};
    }

    @Override
    public Map data() {
        Map dataMap = new HashMap();
        dataMap.put("securityOn", 1);
        dataMap.put("loginPath", "login");
        // 查询后台地址
        String adminPath = (String) commonService.getSiteConfig("adminPath");
        dataMap.put("adminPath", adminPath);
        return dataMap;
    }
}
