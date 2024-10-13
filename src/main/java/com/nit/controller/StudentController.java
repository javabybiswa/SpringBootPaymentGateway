package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.dto.StudentOrder;
import com.nit.service.StudentService;

@Controller //i use normal controller beacuase one ui page also we use 
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String init() {
		
		return "index";
	}
	
	@PostMapping(value="/create-order", produces="application/json")
	@ResponseBody
	public ResponseEntity<StudentOrder> createOrder(@RequestBody StudentOrder studentOrder) throws Exception{
		
	                     StudentOrder createdOrder = service.createOrder(studentOrder);
	                     
	                     return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
	}
	
	@PostMapping("/handle-payment-callback")
	 public String handlePaymentCallback(Map<String, String> respPayload) {
		 System.out.println(respPayload);
          service.updateOrder(respPayload); 
		return "success";
		
	 }
       
}
