package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.MediaTypeRepository;
import chinook.model.MediaType;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class MediaTypeController {
	
	@Inject
	private MediaTypeRepository mediatypeRepository;
	
	private List<MediaType> mediatypes; // getter
	
	@PostConstruct
	void init() {
		mediatypes = mediatypeRepository.findAll();
	}
	
	public List<MediaType> getMediaTypes() {
		return mediatypes;
	}
			
}
