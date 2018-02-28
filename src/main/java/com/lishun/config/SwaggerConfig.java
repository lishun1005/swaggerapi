package com.lishun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 项目文档配置
 * 
 * @author huangxj 2017年11月3日
 * 
 * @version v1.0
 */
@Configuration
@EnableSwagger2 //swagger注解
public class SwaggerConfig {

	@Bean
	public Docket allInterface() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("AllInterface（所有接口）")// 定义组
				.select() // 选择那些路径和api会生成document
				.apis(RequestHandlerSelectors.basePackage("com.lishun.controller")) // 拦截的包路径
				.paths(regex("/.*"))// 拦截的接口路径
				.build() // 创建
				.apiInfo(apiInfo())// 配置说明
				.tags(new Tag("index", "起始页"), getTags());
	}
	/**
	 * @Description:这里可以指定其他tag(对应controller的@Api注解的tags属性值)
	 * @author lishun  
	 * @date 2018/2/28
	 * @param []  
	 * @return springfox.documentation.service.Tag[]  
	 */
	private Tag[] getTags() {
		Tag[] tags = { new Tag("login", "登录相关") };
		return tags;
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()//
				.title("swagger api 文档")// 标题
				.description("swagger api 文档")// 描述
				.termsOfServiceUrl("")//
				.contact(new Contact("", "", ""))// 联系
				.version("1.0")// 版本
				.build();
	}
}