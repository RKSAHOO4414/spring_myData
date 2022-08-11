package com.my.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens", produces= {"application/xml"})
	public List<Alien> getAliens() {
		List<Alien> aliens = repo.findAll();
		int i=9/0;
		System.out.println("fetching aliens");
		
		return aliens;
	}
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien(0, ""));
		
		return alien;
	}
	
	//@PostMapping(path = "alien", consumes = {MediaType.APPLICATION_JSON_VALUE})
	@PostMapping(path = "alien", consumes = {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		
		return alien;
	}
	
}
