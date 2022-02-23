package com.kd.service;

import org.springframework.http.ResponseEntity;

import com.kd.Entity.Customer;

public interface ConsumerService {
   public ResponseEntity<Customer> saveCustomer(Customer c);
   public ResponseEntity<Customer> getCustomer(int id);
   public void updateCustomer(int id,Customer c);
   public boolean deleteCustomer(int id);
}
