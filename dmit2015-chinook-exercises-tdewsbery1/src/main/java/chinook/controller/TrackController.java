package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.TrackRepository;
import chinook.model.Track;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class TrackController {
	
	@Inject
	private TrackRepository trackRepository;
	
	private List<Track> tracks; // getter
	
	@PostConstruct
	void init() {
		tracks = trackRepository.findAll();
	}
	
	public List<Track> getAlbum() {
		return tracks;
	}
			
}