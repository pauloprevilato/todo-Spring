package com.paulo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paulo.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	private TodoRepository todoRepository;	
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}