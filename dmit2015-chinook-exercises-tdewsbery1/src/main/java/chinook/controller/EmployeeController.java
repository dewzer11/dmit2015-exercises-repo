package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.EmployeeRepository;
import chinook.model.Employee;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class EmployeeController {
	
	@Inject
	private EmployeeRepository employeeRepository;
	
	private List<Employee> employees; // getter
	
	@PostConstruct
	void init() {
		employees = employeeRepository.findAll();
	}
	
	public List<Employee> getEmployee() {
		return employees;
	}
			
}