package com.nikhilgupta.SpringBoot.Animes;

import java.util.ArrayList;
import java.util.List;

import com.couchbase.client.deps.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Wrapper {
	
	private List<String> animeEpisodes = new ArrayList<>();

	public List<String> getAnimeEpisodes() {
		return animeEpisodes;
	}

	public void setAnimeEpisodes(List<String> animeEpisodes) {
		this.animeEpisodes = animeEpisodes;
	}

	
}
