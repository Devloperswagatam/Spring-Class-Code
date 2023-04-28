package com.example.demo.entity;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Hero {
	private Long heroID;
	private String heroName;
	private String heroFee;
	private List<Movie> movies;
	public Hero(Long heroID, String heroName, String heroFee) {
		super();
		this.heroID = heroID;
		this.heroName = heroName;
		this.heroFee = heroFee;
	}
}
