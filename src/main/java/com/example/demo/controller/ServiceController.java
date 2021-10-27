package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Test1Model;

@RestController
public class ServiceController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/restcallservice1")
	public ResponseEntity<Test1Model[]> getProductList() {
		System.out.println("hello");
//		Test1Model model = restTemplate.getForObject("http://localhost:9090/dbTest", Test1Model.class);
		ResponseEntity<Test1Model[]> model = restTemplate.getForEntity("http://20.65.40.143:9090/dbTest", Test1Model[].class);
		System.out.println(model);
		return model;
	}

}
