package com.codersfirst.interview;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class HelloReactiveConfig {

    @Bean
    RouterFunction<ServerResponse> routing() {
        return route()
                .GET("/reactive/hello", req -> ok().body(fromObject(new Hello("hello reactive!"))))
                .build();
    }
    
    @Bean
    RouterFunction<ServerResponse> about() {
        return route().GET("/about", request -> ok().body(fromObject("About page"))).build();
    }
    
    @Bean
    RouterFunction<ServerResponse> home() {
        return route().GET("/", request -> ok().body(fromObject("Home page"))).build();
    }
}
