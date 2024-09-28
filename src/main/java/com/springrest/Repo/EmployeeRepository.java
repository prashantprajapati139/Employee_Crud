package com.springrest.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.Entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	void save(Optional<Employee> emp);

}
