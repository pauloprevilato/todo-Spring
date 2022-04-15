package com.paulo.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.todo.domain.Todo;
import com.paulo.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
	
	public void instaciaBaseDeDados() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Hoje1", "1Estudar Spring Boot 2", sdf.parse("01/04/2022 21:00" ), true);
		Todo t2 = new Todo(null, "Hoje2", "2Estudar Spring Boot 2", sdf.parse("01/04/2022 21:00" ), false);
		Todo t3 = new Todo(null, "Hoje3", "3Estudar Spring Boot 2", sdf.parse("01/04/2022 21:00" ), true);
		Todo t4 = new Todo(null, "Hoje4", "4Estudar Spring Boot 2", sdf.parse("01/04/2022 21:00" ), false);
		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
	}
}
