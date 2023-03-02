package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity(name="Farmer")
public class Farmer{
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="farmerId")
	
	
	private int farmerId;
	@Column(name="FarmerName")
	private String farmerName;
	@Column(name="mobileNumber")
	private long mobileNumber;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	
	
//	@ManyToMany
//	private List<CropDetails> listCSF=new ArrayList<>();
//	
//	
//	@ManyToMany
//	private List<LabourForCrop> listLFC=new ArrayList<>();
	
	public Farmer() {
		
	}
	public Farmer(int farmerId, String farmerName, long mobileNumber, String address, String email, String password) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
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
	
	
//	public List<CropDetails> getListCSF() {
//		return listCSF;
//	}
//	public void setListCSF(List<CropDetails> listCSF) {
//		this.listCSF = listCSF;
//	}
//	public List<LabourForCrop> getListLFC() {
//		return listLFC;
//	}
//	public void setListLFC(List<LabourForCrop> listLFC) {
//		this.listLFC = listLFC;
//	}
	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", FarmerName=" + farmerName + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}