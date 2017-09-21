package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Track;

@Stateless
@LocalBean
public class TrackRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Track> findAll() {
		return em.createQuery("SELECT a FROM Track a", Track.class).getResultList();
	}
}