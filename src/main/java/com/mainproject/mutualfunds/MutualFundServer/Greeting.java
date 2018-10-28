package com.mainproject.mutualfunds.MutualFundServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Greeting {
	@GetMapping(path = "/hello")
	public String sayHi() {
		return ("Hi");
	}

}
