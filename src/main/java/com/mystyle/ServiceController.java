package com.mystyle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@GetMapping("service1")
	public String serviceMessage()
	{
		return "Service 1";
	}

}
