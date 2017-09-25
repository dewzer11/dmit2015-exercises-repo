package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.GenreRepository;
import chinook.model.Genre;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class GenreController {
	
	@Inject
	private GenreRepository genreRepository;
	
	private List<Genre> genres; // getter
	
	@PostConstruct
	void init() {
		genres = genreRepository.findAll();
	}
	
	public List<Genre> getGenre() {
		return genres;
	}
			
}