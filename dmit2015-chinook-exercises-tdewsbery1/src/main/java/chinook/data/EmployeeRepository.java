package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Employee;

@Stateless
@LocalBean
public class EmployeeRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Employee> findAll() {
		return em.createQuery("SELECT a FROM Employee a", Employee.class).getResultList();
	}
}