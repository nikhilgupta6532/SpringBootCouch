package com.nikhilgupta.SpringBoot.Animes;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.couchbase.client.core.annotations.InterfaceAudience.Private;
import com.couchbase.client.deps.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
@JsonIgnoreProperties(ignoreUnknown=true)
public class Anime {

	@Id
	@Field
	private int animeId;
	
	@Field
	private String animeName;
	
	@Field
	private double animeRating;
	
	@Field
	private List<String> animeEpisodes;
	
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

	public List<String> getAnimeEpisodes() {
		return animeEpisodes;
	}

	public void setAnimeEpisodes(List<String> animeEpisodes) {
		this.animeEpisodes = animeEpisodes;
	}
	
	
}
