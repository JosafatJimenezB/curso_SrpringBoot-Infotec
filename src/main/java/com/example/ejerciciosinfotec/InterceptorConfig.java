package com.example.ejerciciosinfotec;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InterceptorConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate =
                builder
                        .basicAuthentication("ki","dd")
                        .interceptors(new RestTemplateHeaderModifierInterceptor())
                        .build();

        return restTemplate;
    }
}
