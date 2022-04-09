package com.paulo.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.todo.domain.Todo;
import com.paulo.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
	
	public void instaciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Hoje1", "1Estudar Spring Boot 2", LocalDateTime.parse("01/04/2022 21:00", formatter), true);
		Todo t2 = new Todo(null, "Hoje2", "2Estudar Spring Boot 2", LocalDateTime.parse("01/04/2022 21:00", formatter), false);
		Todo t3 = new Todo(null, "Hoje3", "3Estudar Spring Boot 2", LocalDateTime.parse("01/04/2022 21:00", formatter), true);
		Todo t4 = new Todo(null, "Hoje4", "4Estudar Spring Boot 2", LocalDateTime.parse("01/04/2022 21:00", formatter), false);
		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
	}
}
