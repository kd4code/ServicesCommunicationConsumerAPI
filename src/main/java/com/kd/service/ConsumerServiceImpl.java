package com.kd.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kd.Entity.Customer;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public ResponseEntity<Customer> saveCustomer(Customer c) {
	    String url="http://localhost:8086/customer";  //URL of producer API for save
	    RestTemplate rt=new RestTemplate();
		return rt.postForEntity(url,c,Customer.class); //To save , RestTemplate use postForEntity method 
	}

	@Override
	public ResponseEntity<Customer> getCustomer(int id) {
		String url="http://localhost:8086/customer/"+id; //URL of producer API for get
	    RestTemplate rt= new RestTemplate();
	    return  rt.getForEntity(url,Customer.class);  //To get , RestTemplate use getForEntity method 
	
	}

	@Override
	public void updateCustomer(int id, Customer c) {
		String url="http://localhost:8086/customer/"+id;  //URL of producer API for update
	    RestTemplate rt= new RestTemplate();  
	    rt.put(url,c);  //To update , RestTemplate use put method
	}
	
	@Override
	public boolean deleteCustomer(int id) {
	    String url="http://localhost:8086/customer/"+id;  //URL of producer API for delete
	    RestTemplate rt= new RestTemplate();
	    rt.delete(url);  //To update , RestTemplate use delete method
		return true;
	}

	
	

}
