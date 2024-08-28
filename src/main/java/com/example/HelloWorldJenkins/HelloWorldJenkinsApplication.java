package com.example.HelloWorldJenkins;

import com.example.HelloWorldJenkins.Controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldJenkinsApplication {


	public static void main(String[] args) {

		System.out.println(HelloController.hello());
		SpringApplication.run(HelloWorldJenkinsApplication.class, args);
	}

}
