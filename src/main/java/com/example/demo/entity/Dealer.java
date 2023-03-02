package com.example.demo.entity;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {
	@Id
	@GeneratedValue
	private int dealerId;
	private String dealerName;
	private long mobileNumber;
	private String address;
	private String email;
	private String password;
	
//	@ManyToMany
//	private List<CropSales> listCSD=new ArrayList<>();
	
	
	public Dealer(){
		
	}
	public Dealer(int dealerId, String dealerName, long mobileNumber, String address, String email, String password) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}

//	public List<CropSales> getListCSD() {
//		return listCSD;
//	}
//	public void setListCSD(List<CropSales> listCSD) {
//		this.listCSD = listCSD;
//	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
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
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
}