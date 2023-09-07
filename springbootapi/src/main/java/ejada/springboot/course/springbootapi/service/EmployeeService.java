package ejada.springboot.course.springbootapi.service;

import java.util.List;

import ejada.springboot.course.springbootapi.model.Employee;

public interface EmployeeService {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}
