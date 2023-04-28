package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Hero;
import com.example.demo.entity.Movie;
import com.example.demo.services.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {
	@Autowired
	private HeroService heroService;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public Hero getHeroById(@PathVariable("id") Long id) {
		Hero hero = heroService.getHeroById(id);
		List<Movie> movies = restTemplate.getForObject("http://localhost:8081/movies/"+hero.getHeroID(), List.class);
		hero.setMovies(movies);
		return hero;
	}
}
