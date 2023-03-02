package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Labour")
public class Labour {
	

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private int labourId;
	private String labourName;
	private long mobileNumber;
	private String address;
	private int quantity;
	private String email;
	private String password;
	
	@ManyToMany
	List<LabourForCrop> labList=new ArrayList<>();
	
	public Labour() {
		
	}
	public Labour(int labourId, String labourName, long mobileNumber, String address, int quantity, String email,
			String password) {
		super();
		this.labourId = labourId;
		this.labourName = labourName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.quantity = quantity;
		this.email = email;
		this.password = password;
	}
	public int getLabourId() {
		return labourId;
	}
	public void setLabourId(int labourId) {
		this.labourId = labourId;
	}
	public String getLabourName() {
		return labourName;
	}
	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Labour [labourId=" + labourId + ", labourName=" + labourName + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", quantity=" + quantity + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
