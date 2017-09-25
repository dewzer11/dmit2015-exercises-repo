package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Genre;

@Stateless
@LocalBean
public class GenreRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Genre> findAll() {
		return em.createQuery("SELECT a FROM Genre a", Genre.class).getResultList();
	}
}