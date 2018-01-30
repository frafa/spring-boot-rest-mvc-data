package it.ff.spring.boot.example.demo_spring_boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Users", schema="dbo")
public @Data class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	
	@Column(name="authenticationMode")
	private String authenticationMode;
}
