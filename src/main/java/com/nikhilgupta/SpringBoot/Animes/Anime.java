package com.nikhilgupta.SpringBoot.Animes;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Anime {

	@Id
	@Field
	private int animeId;
	
	@Field
	private String animeName;
	
	@Field
	private double animeRating;
	
	public Anime() {}
	
	public Anime(int animeId, String animeName, double animeRating) {
		this.animeId = animeId;
		this.animeName = animeName;
		this.animeRating = animeRating;
	}
	
	public int getAnimeId() {
		return animeId;
	}
	public void setAnimeId(int animeId) {
		this.animeId = animeId;
	}
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	public double getAnimeRating() {
		return animeRating;
	}
	public void setAnimeRating(double animeRating) {
		this.animeRating = animeRating;
	}
}
