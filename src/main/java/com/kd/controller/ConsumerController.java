package com.kd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kd.Entity.Customer;
import com.kd.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService cs;

	@PostMapping("/save")
	public ResponseEntity<Customer> save(@RequestBody Customer c) {
		return cs.saveCustomer(c);

	}

	@GetMapping("/read/{id}")
	public ResponseEntity<Customer> get(@PathVariable("id") int id) {
		return cs.getCustomer(id);
	}
	
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody Customer c)
    {
      cs.updateCustomer(id, c);
      return new ResponseEntity<>("Record Updated Successfully..",HttpStatus.OK);
    }
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
	    cs.deleteCustomer(id);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		
	}

}