package com.example.springbootfirst.springbootfirst.repositories;

import com.example.springbootfirst.springbootfirst.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//EmployeeEntity: This is the entity type that the repository manages. It is a JPA entity that typically maps to a database table.
//Long: This is the type of the primary key of the entity. It indicates that the EmployeeEntity uses a Long value as its unique identifier.
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
