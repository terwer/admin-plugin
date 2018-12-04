package com.terwergreen.plugins.admin.front;

import com.terwergreen.core.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * webFlux Api
 *
 * @author Terwer
 * @version 1.0
 * 2018/11/23 15:02
 **/
@Component
public class AdminApi {

    @Autowired
    private CommonService commonService;

    public RouterFunction<?> adminApi() {
        return route(GET("/api/admin"), req -> ServerResponse.ok().body(Mono.just("admin api in plugin:systemInfo" + commonService.getSiteConfig("webname")), String.class));
    }

    public RouterFunction<?> adminInfoApi() {
        return route(GET("/api/admin/info"), req -> ServerResponse.ok().body(Mono.just("admin api info in plugin"), String.class));
    }
}

