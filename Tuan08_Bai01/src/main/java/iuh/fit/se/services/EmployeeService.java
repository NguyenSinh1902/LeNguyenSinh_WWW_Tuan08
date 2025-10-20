package iuh.fit.se.services;

import iuh.fit.se.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void save(Employee emp);
    void delete(Long id);
    List<Employee> search(String keyword);
}

