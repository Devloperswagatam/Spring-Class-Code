package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Movie;

public interface MovieService {
	public List<Movie> getMoviesByHeroId(Long id);
}
