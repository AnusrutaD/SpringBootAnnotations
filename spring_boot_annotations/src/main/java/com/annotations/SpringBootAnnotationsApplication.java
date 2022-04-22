package com.annotations;

import com.myPack.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("student1")
	Student student;
	@Autowired
	Date date;
	@Autowired
	Emp emp;
	@Autowired
	Dog dog;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) {

		this.student.studying();
		this.emp.calling();
		this.dog.eating();
	}
}
