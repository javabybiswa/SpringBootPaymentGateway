package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.dto.StudentOrder;

public interface StudentOrderRepo extends JpaRepository<StudentOrder, Integer> {
	
	public StudentOrder findByRazorpayOrderId(String orderId);

}
