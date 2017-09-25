package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Customer;

@Stateless
@LocalBean
public class CustomerRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Customer> findAll() {
		return em.createQuery("SELECT a FROM Customer a", Customer.class).getResultList();
	}
}