package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Long> {
    List<Manager> findByEmployeeRoleContains(@Param("q") String role) ;

}
