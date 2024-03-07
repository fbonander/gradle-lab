package com.trly.gradlebuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestGradleBuildApplication {

	public static void main(String[] args) {
		SpringApplication.from(GradleBuildApplication::main).with(TestGradleBuildApplication.class).run(args);
	}

}
