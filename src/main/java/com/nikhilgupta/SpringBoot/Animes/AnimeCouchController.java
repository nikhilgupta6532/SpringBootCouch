package com.nikhilgupta.SpringBoot.Animes;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@ViewIndexed(designDoc="anime")
public interface AnimeCouchController extends CouchbasePagingAndSortingRepository<Anime, Integer>{

}
