package com.nikhilgupta.SpringBoot.Animes;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {

	@Autowired
	private AnimeService animeService;

	@RequestMapping(method = RequestMethod.POST, value = "/anime")
	public Anime saveAnime(@RequestBody Anime anime) {
		System.out.println(anime);
		return animeService.saveAnime(anime);
	}

	@RequestMapping("/anime/{id}")
	public Optional<Anime> getAnime(@PathVariable int id) {
		return animeService.getAnime(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteAnime/{id}")
	public String deleteAnime(@PathVariable int id) {
		animeService.deleteAnime(id);
		return "Anime deleted";
	}

	@RequestMapping("/anime")
	public Iterable<Anime> getAllAnimes() {
		return animeService.getAllAnimes();
	}

	@GetMapping("/animeName/{name}")
	public List<Anime> getAnimeByName(@PathVariable("name") String name) {
		System.out.println(name);
		return animeService.getAnimeByName(name);
	}

	@PostMapping("/animeName/{id}")
	public void updateAnimeName(@PathVariable("id") int id, @RequestBody WrapperName animeName) {
		System.out.println(animeName.getAnimeName());
		animeService.updateAnimeName(id, animeName);
		
	}
	
	@PostMapping("/animeEpisode/{id}")
	public void saveAnimeEpisode(@PathVariable("id") int id, @RequestBody Wrapper animeEpisode) {
		System.out.println(animeEpisode.getAnimeEpisodes());
		animeService.saveAnimeEpisode(id,animeEpisode.getAnimeEpisodes());
	}
	
	@PostMapping("/animeRating/{id}")
	public void updateAnimeRating(@PathVariable("id") int id , @RequestBody WrapperRating animeRating) {
		System.out.println("Anime controller "+animeRating.getAnimeRating());
		animeService.updateAnimeRating(id,animeRating.getAnimeRating());
	}
	
}
