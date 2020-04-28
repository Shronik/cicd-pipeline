package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameService {
	
	@GetMapping("/game")
	public String sayHello() {
		return "Gaming phones List";
	}
}
