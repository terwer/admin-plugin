package com.terwergreen.plugins;

import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.reactive.function.server.RouterFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Terwer
 * @Date 2018/11/27 15:39
 * @Version 1.0
 * @Description 扩展点
 **/
@Extension
public class AdminPluginExtension implements PluginInterface {
    private static final Logger logger = LoggerFactory.getLogger(AdminPluginExtension.class);
    private ApplicationContext applicationContext;

    private void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        logger.debug("AdminPlugin registerBean,applicationContext is:" + applicationContext);
    }

    @Override
    public String identify() {
        return "AdminPlugin identify in plugin";
    }

    @Override
    public List<?> reactiveRoutes() {
        return new ArrayList<RouterFunction<?>>() {{
        }};
    }
}
