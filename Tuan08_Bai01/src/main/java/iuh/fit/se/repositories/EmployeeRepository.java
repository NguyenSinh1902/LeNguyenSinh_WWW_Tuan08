package iuh.fit.se.repositories;

import iuh.fit.se.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstNameContainingIgnoreCase(String keyword);
}

