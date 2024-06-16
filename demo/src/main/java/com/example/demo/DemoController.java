package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value = "/getNames", produces = "application/json")
	public List<String> getNameList(){
		return Arrays.asList("applie","ball");
	}

}
