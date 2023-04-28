package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Hero;

@Service
public class HeroServiceImp implements HeroService {

	List<Hero> heros = List.of(new Hero(1L, "Amir", "3cr"), new Hero(2L, "Salman", "4cr"),
			new Hero(3L, "Sharuk", "4cr"));

	@Override
	public Hero getHeroById(Long heroID) {
		// TODO Auto-generated method stub
		
		Hero hero = heros.stream().filter(h -> h.getHeroID().equals(heroID)).findAny().orElse(null);
		return hero;
	}

}
