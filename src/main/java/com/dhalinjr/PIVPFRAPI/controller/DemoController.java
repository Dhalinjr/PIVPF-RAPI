package com.dhalinjr.PIVPFRAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/")
	public String index(){
	    return "Hello world";
	}
	
	
}
