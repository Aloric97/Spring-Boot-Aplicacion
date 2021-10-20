package com.proyecto.leandro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.leandro.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
