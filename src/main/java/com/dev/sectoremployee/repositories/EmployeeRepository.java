package com.dev.sectoremployee.repositories;

import com.dev.sectoremployee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
