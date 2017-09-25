package chinook.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import chinook.model.Playlist;;

@Stateless
@LocalBean
public class PlaylistRepository {

	@Inject  
	private EntityManager em;
	
	
	public List<Playlist> findAll() {
		return em.createQuery("SELECT a FROM Playlist a", Playlist.class).getResultList();
	}
}
