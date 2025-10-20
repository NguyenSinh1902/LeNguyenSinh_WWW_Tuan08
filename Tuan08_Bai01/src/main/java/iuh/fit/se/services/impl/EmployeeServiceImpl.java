package iuh.fit.se.services.impl;

import iuh.fit.se.entities.Employee;
import iuh.fit.se.repositories.EmployeeRepository;
import iuh.fit.se.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void save(Employee emp) {
        repo.save(emp);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Employee> search(String keyword) {
        return repo.findByFirstNameContainingIgnoreCase(keyword);
    }
}

