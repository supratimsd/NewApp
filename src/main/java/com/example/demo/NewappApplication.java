package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NewappApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(NewappApplication.class, args);
		Student st=context.getBean(Student.class);
		st.Project();

	}

}
