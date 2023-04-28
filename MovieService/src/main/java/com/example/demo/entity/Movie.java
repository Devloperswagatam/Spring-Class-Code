package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
	private Long movieID;
	private String movieName;
	private Long movieYear;
	private Long heroID;
}
