package com.my.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.my.demo.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		
		
		m.addAttribute("result", repo.findAll());
		
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAliens(@RequestParam int aid, Model m) {
		
		
		m.addAttribute("result", repo.getOne(aid));
		
		return "showAliens";
	}
	
	@GetMapping("getAlienbyname")
	public String getAlienByName(@RequestParam String aname, Model m) {
		
		
		//m.addAttribute("result", repo.findByAnameOrderByAid(aname));
		m.addAttribute("result", repo.find(aname));
		
		return "showAliens";
	}
	
	@PostMapping(value="addAlien")
	public String AddAlien(@ModelAttribute Alien a){
		
		repo.save(a);
		return "result";
	}
	
}
