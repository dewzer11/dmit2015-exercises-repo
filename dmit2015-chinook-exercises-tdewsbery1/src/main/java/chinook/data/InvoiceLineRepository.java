package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.InvoiceLine;

@Stateless
@LocalBean
public class InvoiceLineRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<InvoiceLine> findAll() {
		return em.createQuery("SELECT a FROM InvoiceLine a", InvoiceLine.class).getResultList();
	}
}
