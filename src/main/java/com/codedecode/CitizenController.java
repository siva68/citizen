package com.codedecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitizenController
{
	@Autowired
	CitizenRepo citizenRepo;
	
	@GetMapping("/home/{id}")
	public ResponseEntity<Citizen> findById(@PathVariable long id)
	{
		Citizen c=citizenRepo.getById(id);
		
		return new ResponseEntity<>(c,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	@PostMapping(path="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen )
	{
		Citizen citizens = citizenRepo.save(citizen);
		
		 
		return new ResponseEntity<>(citizens,HttpStatus.OK);
	}
	
	
	
}
