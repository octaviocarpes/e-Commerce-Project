package com.users.usersservice.config;

import com.google.common.base.Predicate;
import springfox.documentation.RequestHandler;
import springfox.documentation.service.Parameter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        Predicate<RequestHandler> endpointSelector = RequestHandlerSelectors.any();

        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(this.getGlobalParameters())
                .select()
                .apis(endpointSelector)
                .paths(PathSelectors.any())
                .build();
    }

    private List<Parameter> getGlobalParameters() {
        List<Parameter> list = new ArrayList<Parameter>();
        return list;
    }
}