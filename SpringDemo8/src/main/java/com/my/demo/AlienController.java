package com.my.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		List<Alien> aliens = repo.findAll();
		
		return aliens;
	}
	
	@GetMapping("alien/{aid}")
	@ResponseBody
	public Alien getAlien(@PathVariable int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien(0, ""));
		
		return alien;
	}
	
}
