package com.nikhilgupta.Animes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.nikhilgupta.SpringBoot.Animes.Anime;
import com.nikhilgupta.SpringBoot.Animes.AnimeController;
import com.nikhilgupta.SpringBoot.Animes.AnimeCouchController;
import com.nikhilgupta.SpringBoot.Animes.AnimeService;

class AnimeMockTest {

	@Test
	void testAnimeRepository_Positive() {

		AnimeCouchController animeCouchControllerMock = mock(AnimeCouchController.class);

		Anime anime = new Anime(1, "DeathNote", 9.4);

		when(animeCouchControllerMock.findById(anyInt())).thenReturn(Optional.of(anime));

		assertEquals(anime, animeCouchControllerMock.findById(1).get());

	}

	@Test
	void testAnimeService_Positive() {
		AnimeService animeService = mock(AnimeService.class);

		Anime anime = new Anime(1, "DeathNote", 9.4);

		when(animeService.getAnime(anyInt())).thenReturn(Optional.of(anime));

		assertEquals(anime, animeService.getAnime(1).get());
	}

	@Test
	void testAnimeController_Positive() {
		AnimeController animeController = mock(AnimeController.class);

		Anime anime = new Anime(1, "DeathNote", 9.4);

		when(animeController.getAnime(anyInt())).thenReturn(Optional.of(anime));

		assertEquals(anime, animeController.getAnime(1).get());

	}

	@Test
	void testAnimeRepository_Negative() {
		AnimeCouchController animeCouchController = mock(AnimeCouchController.class);

		when(animeCouchController.findById(anyInt())).thenReturn(null);

		assertEquals(null, animeCouchController.findById(1));

	}

	@Test
	void testAnimeService_Negative() {
		AnimeService animeService = mock(AnimeService.class);

		when(animeService.getAnime(anyInt())).thenReturn(null);

		assertEquals(null, animeService.getAnime(1));
	}

	@Test
	void testAnimeController_Negative() {
		AnimeController animeController = mock(AnimeController.class);

		when(animeController.getAnime(anyInt())).thenReturn(null);

		assertEquals(null, animeController.getAnime(1));

	}

}
