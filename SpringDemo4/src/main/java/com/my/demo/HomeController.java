package com.my.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.my.demo.model.Alien;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		
		int num3 = i + j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	
	@RequestMapping("addAlien")
	public String AddAlien(@ModelAttribute("a1") Alien a){
		
		return "result";
	}
	
	
}
