package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public boolean delete(long id){
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }

    public Optional<Employee> findById(long id){
        return employeeRepository.findById(id);
    }
}
