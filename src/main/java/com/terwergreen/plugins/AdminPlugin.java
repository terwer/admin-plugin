package com.terwergreen.plugins;

import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Terwer
 * @Date 2018/11/27 15:19
 * @Version 1.0
 * @Description 后台基础插件，包含插件管理，插件市场等功能
 **/
public class AdminPlugin extends BugucmsPlugin {
    private static final Logger logger = LoggerFactory.getLogger(AdminPlugin.class);

    public AdminPlugin(PluginWrapper wrapper) {
        super(wrapper);
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
