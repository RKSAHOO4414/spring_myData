package com.my.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		
		int num3 = i + j;
		m.addAttribute("num3", num3);
		//mv.addObject("num3", num3);
		
		return "result";
	}
	
	/*@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {
		
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		
		int num3 = i + j;
		m.addAttribute("num3", num3);
		//mv.addObject("num3", num3);
		
		return "result";
	}*/
}
