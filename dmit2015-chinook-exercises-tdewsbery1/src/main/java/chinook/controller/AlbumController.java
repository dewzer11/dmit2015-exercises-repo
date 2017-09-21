package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.AlbumRepository;
import chinook.model.Album;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class AlbumController {
	
	@Inject
	private AlbumRepository albumRepository;
	
	private List<Album> albums; // getter
	
	@PostConstruct
	void init() {
		albums = albumRepository.findAll();
	}
	
	public List<Album> getAlbum() {
		return albums;
	}
			
}
