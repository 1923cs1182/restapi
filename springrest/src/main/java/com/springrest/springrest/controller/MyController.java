package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Load;

import com.springrest.springrest.serices.LoadService;

import java.util.*;

@RestController
public class MyController {
	
	@Autowired
	 public LoadService loadService;

 
	//get all loading 
	@GetMapping("/load")
	public List<Load> getLoads(){
		
		return this.loadService.getLoads();
	}
	
	
	//return course
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId){
		
		return this.loadService.getLoad(loadId);
	}

	
	//add course
	@PostMapping("/load")
	public void addLoad(@RequestBody Load load) {
		
		this.loadService.addLoad(load);
	}
	
	//delete the course
	@DeleteMapping("'/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId) {
		
		this.loadService.deleteLoad(loadId);
	}
	
}
