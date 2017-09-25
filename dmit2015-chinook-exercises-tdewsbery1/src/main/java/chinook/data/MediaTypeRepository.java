package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.MediaType;

@Stateless
@LocalBean
public class MediaTypeRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<MediaType> findAll() {
		return em.createQuery("SELECT a FROM MediaType a", MediaType.class).getResultList();
	}
}