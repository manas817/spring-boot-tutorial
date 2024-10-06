package com.springboot.myapp.repository;

import com.springboot.myapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// by default the endpoint is the plural form of entity name, in this case "employees" we can change it using RRR.
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
