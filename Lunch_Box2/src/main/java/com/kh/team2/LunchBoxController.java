package com.kh.team2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/lb")
public class LunchBoxController {
	
	@RequestMapping(value = "/join")
	public String join() {
		
		
		return "join";
	}
	@RequestMapping(value = "/login")
	public String login() {
		
		
		return "login";
	}
	
}