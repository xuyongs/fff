package com.imooc.manager.configurations;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Xyong
 * @since: 2019/11/5-----------------------ddddddddddd-----
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
//    @Bean
//    public Docket controllerApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("controller")
//                .apiInfo(apiInfo())
//                .select().apis(RequestHandlerSelectors.basePackage(ProductController.class.getPackage().getName()))
//                .paths(PathSelectors.ant("/products/*"))
//                .build();
//
//    }
//    @Bean
//    public Docket defaultApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
////                .groupName("controller")
////                .apiInfo(apiInfo())
//                .select().apis(RequestHandlerSelectors.basePackage(BasicErrorController.class.getPackage().getName()))
////                .paths(PathSelectors.ant("/products/*"))
//                .build();
//
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("HTTP API")
//                .description("管理端接口")
//                .termsOfServiceUrl("http://springfox.io")
//                .contact("imooc")
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
//                .version("2.0")
//                .build();
//    }
}


























