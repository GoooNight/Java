package com.lrw.gatewaydemo.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description
 * @author:awei
 * @date:2019/9/4
 * @ver:1.0
 **/
@Configuration
public class GateConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        RouteLocator build = builder.routes().route(r ->
                r.path("/bad/**").filters(f -> f.hystrix(config -> config.setName("MY")
                        .setFallbackUri("forward:/fallback")).stripPrefix(1)).uri("lb://PROVIDER01")
        ).build();
        return build;
    }

}
