package com.terwergreen.plugins;

import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author Terwer
 * @Date 2018/11/27 15:19
 * @Version 1.0
 * @Description 后台基础插件，包含插件管理，插件市场等功能
 **/
public class AdminPlugin extends BugucmsPlugin {
    private static final Logger logger = LoggerFactory.getLogger(AdminPlugin.class);
    private GenericApplicationContext applicationContext;

    public AdminPlugin(PluginWrapper wrapper) {
        super(wrapper);
        this.applicationContext =super.getBugucmsApplicationContext();
        logger.info("AdminPlugin contructor");
        // 注册插件依赖
        // super.registerBean(Object.class);
    }

    @Override
    public void start() throws PluginException {
        super.start();
        logger.info("AdminPlugin started");
    }

    @Override
    public void stop() {
        super.stop();
        logger.info("AdminPlugin stoped");
    }
}
