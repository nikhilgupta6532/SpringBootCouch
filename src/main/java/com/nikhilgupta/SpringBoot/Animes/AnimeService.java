package com.nikhilgupta.SpringBoot.Animes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {
	
	@Autowired
	private AnimeCouchController animeCouchController;

	public Anime saveAnime(Anime anime) {
		 animeCouchController.save(anime);
		 return anime;
	}
	
	public Optional<Anime> getAnime(int id) {
		return animeCouchController.findById(id);
	}
}
