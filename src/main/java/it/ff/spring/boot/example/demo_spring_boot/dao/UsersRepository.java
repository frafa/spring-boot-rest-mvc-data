package it.ff.spring.boot.example.demo_spring_boot.dao;

import it.ff.spring.boot.example.demo_spring_boot.model.User;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<User, Long> {

}
