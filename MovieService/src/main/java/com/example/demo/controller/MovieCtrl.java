package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieCtrl {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/{id}")
	public List<Movie> getMovieByHeroId(@PathVariable("id") Long id){
		return movieService.getMoviesByHeroId(id);
	}
}
