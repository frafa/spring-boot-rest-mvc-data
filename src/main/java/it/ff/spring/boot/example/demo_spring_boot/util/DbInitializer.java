package it.ff.spring.boot.example.demo_spring_boot.util;

import it.ff.spring.boot.example.demo_spring_boot.dao.UsersRepository;
import it.ff.spring.boot.example.demo_spring_boot.model.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer {
	@Autowired
	private UsersRepository repository;
	
	@PostConstruct
	public void init ()
	{
		User u1 = new User();
		u1.setUserName("Utente 1");
		u1.setPassword("password 1");
		repository.save(u1);
		User u2 = new User();
		u2.setUserName("Utente 2");
		u2.setPassword("password 2");
		repository.save(u2);
		User u3 = new User();
		u3.setUserName("Utente 3");
		u3.setPassword("password 3");
		repository.save(u3);

		repository.findAll().forEach(System.out::println);
	}
	
}
