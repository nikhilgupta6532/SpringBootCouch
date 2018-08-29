package com.nikhilgupta.SpringBoot.Animes;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@ViewIndexed(designDoc="anime")
public interface AnimeCouchController extends CouchbasePagingAndSortingRepository<Anime, Integer>{

	@Query("#{#n1ql.selectEntity} where animeName=$1")
	public List<Anime> getAnimeByName(String name);

	@Query("update #{#n1ql.bucket} set animeName = $2 where animeRating = $1")
	public void updateAnime(Double id, String animeName);
	
	@Query("update #{#n1ql.bucket} set animeEpisodes = $2 where animeRating = $1 ")
	public void updateAnimeEpisode(Double id , List<String> episodes);
}
