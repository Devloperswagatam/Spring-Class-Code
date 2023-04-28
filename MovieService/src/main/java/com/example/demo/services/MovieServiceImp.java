package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Movie;

@Service
public class MovieServiceImp implements MovieService {

	List<Movie> movies = List.of(new Movie(1L, "Movie-1", 2000L, 1L), new Movie(2L, "Movie-2", 2001L, 2L),
			new Movie(3L, "Movie-3", 2003L, 3L), new Movie(4L, "Movie-4", 2005L, 1L),
			new Movie(5L, "Movie-5", 2006L, 2L), new Movie(6L, "Movie-6", 2007L, 3L));

	@Override
	public List<Movie> getMoviesByHeroId(Long id) {
		// TODO Auto-generated method stub
		List<Movie> movie = movies.stream().filter(m -> m.getHeroID().equals(id)).collect(Collectors.toList());
		return movie;
	}

}
