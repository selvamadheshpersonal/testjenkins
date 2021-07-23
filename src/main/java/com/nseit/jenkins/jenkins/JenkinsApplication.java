package com.nseit.jenkins.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nseit.jenkins")
public class JenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Application Started!!");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
