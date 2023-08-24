package com.educandoweb.course.ressources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserRessource {
	
	@GetMapping
	//Metedo teste para acessar os usuários
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@email.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
