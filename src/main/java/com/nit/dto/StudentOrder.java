package com.nit.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_order")
public class StudentOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer orderId;
	
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phno;
	@Column
	private String course;
	@Column
	private Integer amount;
	@Column
	private String orderStatus;
	@Column
	private String razorpayOrderId;
	public StudentOrder(Integer orderId, String name, String email, String phno, String course, Integer amount,
			String orderStatus, String razorpayOrderId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.course = course;
		this.amount = amount;
		this.orderStatus = orderStatus;
		this.razorpayOrderId = razorpayOrderId;
	}
	public StudentOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getRazorpayOrderId() {
		return razorpayOrderId;
	}
	public void setRazorpayOrderId(String razorpayOrderId) {
		this.razorpayOrderId = razorpayOrderId;
	}
	@Override
	public String toString() {
		return "StudentOrder [orderId=" + orderId + ", name=" + name + ", email=" + email + ", phno=" + phno
				+ ", course=" + course + ", amount=" + amount + ", orderStatus=" + orderStatus + ", razorpayOrderId="
				+ razorpayOrderId + "]";
	}
	
}
