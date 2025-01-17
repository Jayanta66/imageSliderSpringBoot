package com.example.imageSlider.controller;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/") 
	public String index(Model model) {
		// You can add model attributes here if needed 
		return "index"; 
		}
	}


