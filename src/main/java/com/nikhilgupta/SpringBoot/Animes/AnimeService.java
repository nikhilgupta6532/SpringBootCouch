package com.nikhilgupta.SpringBoot.Animes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseOperations;
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
	
	public void deleteAnime(int id) {
		animeCouchController.deleteById(id);
	}
	
	public Iterable<Anime> getAllAnimes(){
		return animeCouchController.findAll();
	}

	public List<Anime> getAnimeByName(String name) {
		return animeCouchController.getAnimeByName(name);
	}
	
	public void updateAnimeName(int id, WrapperName animeName) {
		System.out.println("Anime servie "+ animeName.getAnimeName());
		Anime anime = animeCouchController.findById(id).get();
		anime.setAnimeName(animeName.getAnimeName());
		System.out.println("Anime"+anime.getAnimeName());
		CouchbaseOperations couchbaseOperations = animeCouchController.getCouchbaseOperations();
		couchbaseOperations.update(anime);
		//return 1;
	}

	public void saveAnimeEpisode(int id , List<String> animeEpisode) {
		System.out.println("inside service" + animeEpisode);
		Anime anime = animeCouchController.findById(id).get();
		anime.setAnimeEpisodes(animeEpisode);
		CouchbaseOperations couchbaseOperations = animeCouchController.getCouchbaseOperations();
		couchbaseOperations.update(anime);
	}

	public void updateAnimeRating(int id, double animeRating) {
		System.out.println("Anime service "+animeRating);
		Anime anime = animeCouchController.findById(id).get();
		anime.setAnimeRating(animeRating);
		CouchbaseOperations couchbaseOperations = animeCouchController.getCouchbaseOperations();
		couchbaseOperations.update(anime);
	}

	
}
