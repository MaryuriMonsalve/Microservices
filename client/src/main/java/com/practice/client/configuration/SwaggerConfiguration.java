package com.practice.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {


    @Bean
    public Docket swaggerSpringfoxDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                //.pathMapping("/api")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.practice.cliente.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .genericModelSubstitutes(ResponseEntity.class)
                ;

        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Prueba Backend PRAGMA",
                "Aplicacion Java",
                "V. 1.0",
                "Derechos reservados",
                null,
                "License of API", "API license URL", Collections.emptyList());
    }
}
