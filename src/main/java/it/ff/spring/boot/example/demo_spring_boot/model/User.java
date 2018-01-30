package it.ff.spring.boot.example.demo_spring_boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String UserName;
	private String Password;
	private String AuthenticationMode;
}
