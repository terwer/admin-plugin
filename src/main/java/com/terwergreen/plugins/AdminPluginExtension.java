package com.terwergreen.plugins;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pf4j.Extension;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Author Terwer
 * @Date 2018/11/27 15:39
 * @Version 1.0
 * @Description 扩展点
 **/
@Extension
public class AdminPluginExtension extends BugucmsPluginExtension {
    private static final Log logger = LogFactory.getLog(AdminPluginExtension.class);
    private GenericApplicationContext applicationContext;

    public AdminPluginExtension(GenericApplicationContext applicationContext) {
        super(applicationContext);
        this.applicationContext = applicationContext;
        logger.info("AdminPluginExtension contructor");
        // 注册插件依赖
        // super.registerBean(Object.class);
    }


    @Override
    public String identify() {
        return "AdminPlugin identify in plugin";
    }

    @Override
    public List<?> reactiveRoutes() {
//        return new ArrayList<RouterFunction<?>>() {{
//        }};
        return null;
    }

    @Override
    public Map data() {
        return null;
    }
}
