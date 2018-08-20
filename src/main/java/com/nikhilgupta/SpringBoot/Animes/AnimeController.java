package com.nikhilgupta.SpringBoot.Animes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {
	
	@Autowired
	private AnimeService animeService;

	@RequestMapping(method=RequestMethod.POST , value ="/anime")
	public Anime saveAnime(@RequestBody Anime anime) {
		return animeService.saveAnime(anime);
	}
	
	@RequestMapping("/anime/{id}")
	public Optional<Anime> getAnime(@PathVariable int id) {
		return animeService.getAnime(id);
	}
}
