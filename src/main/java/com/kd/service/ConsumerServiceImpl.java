package com.kd.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kd.Entity.Customer;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public ResponseEntity<Customer> saveCustomer(Customer c) {
	    String url="http://localhost:8086/customer";
	    RestTemplate rt=new RestTemplate();
		return rt.postForEntity(url,c,Customer.class);
	}

	@Override
	public ResponseEntity<Customer> getCustomer(int id) {
		String url="http://localhost:8086/customer/"+id;
	    RestTemplate rt= new RestTemplate();
	    return  rt.getForEntity(url,Customer.class);
	
	}

	@Override
	public void updateCustomer(int id, Customer c) {
		String url="http://localhost:8086/customer/"+id;
	    RestTemplate rt= new RestTemplate();
	    rt.put(url,c);
	}
	
	@Override
	public boolean deleteCustomer(int id) {
	    String url="http://localhost:8086/customer/"+id;
	    RestTemplate rt= new RestTemplate();
	    rt.delete(url);
		return true;
	}

	
	

}
