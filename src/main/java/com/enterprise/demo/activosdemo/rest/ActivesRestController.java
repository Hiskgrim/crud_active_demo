package com.enterprise.demo.activosdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivesRestController {

	@GetMapping("/")
	public String getHello() {
		return "Hello world";
	}
}
