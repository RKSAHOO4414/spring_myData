package com.my.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.my.demo.model.Alien;

@Controller
public class HomeController {
	
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
		
		List<Alien> aliens = Arrays.asList(new Alien(101, "Raja"), new Alien(102, "Rani"));
		m.addAttribute("result", aliens);
		
		return "showAliens";
	}
	
	@RequestMapping(value="addAlien")
	public String AddAlien(@ModelAttribute Alien a){
		
		return "result";
	}
	
	
}
