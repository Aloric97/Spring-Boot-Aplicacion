package com.proyecto.leandro.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.leandro.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}


