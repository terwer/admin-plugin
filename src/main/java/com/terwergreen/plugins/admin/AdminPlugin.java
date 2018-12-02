package com.terwergreen.plugins.admin;

import com.terwergreen.plugins.BugucmsPlugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Terwer
 * @Date 2018/11/27 16:03
 * @Version 1.0
 * @Description Hello World
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
