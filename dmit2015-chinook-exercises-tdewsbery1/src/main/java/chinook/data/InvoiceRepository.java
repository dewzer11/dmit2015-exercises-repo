package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Invoice;;

@Stateless
@LocalBean
public class InvoiceRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Invoice> findAll() {
		return em.createQuery("SELECT a FROM Invoice a", Invoice.class).getResultList();
	}
}