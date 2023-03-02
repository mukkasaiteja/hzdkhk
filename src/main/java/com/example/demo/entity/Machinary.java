package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Machinary")
public class Machinary {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int machineId;
	
	private int farmerId;
	private String ownerName;
	private String machineName;
	private int cost;
	private String description;
	private long mobileNumber;
	private String address;
	private String email;
	private String password;
	private String pic;
	
	
//	@OneToMany
//	@JoinColumn(name="dealerId")
//	Farmer farmer;
	
	@ManyToMany
	private List<Farmer> fsl=new ArrayList<>();
	
	
	public Machinary() {
		
	}



	public Machinary(int machineId, int farmerId, String ownerName, String machineName, int cost, String description,
			long mobileNumber,String address, String email, String password, String pic) {
		super();
		this.machineId = machineId;
		this.farmerId = farmerId;
		this.ownerName = ownerName;
		this.machineName = machineName;
		this.cost = cost;
		this.description = description;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address=address;
		this.password = password;
		this.pic = pic;
	}



	public int getMachineId() {
		return machineId;
	}



	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}



	public int getFarmerId() {
		return farmerId;
	}



	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}



	public String getOwnerName() {
		return ownerName;
	}



	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public String getMachineName() {
		return machineName;
	}



	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
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



	public String getPic() {
		return pic;
	}



	public void setPic(String pic) {
		this.pic = pic;
	}



	public List<Farmer> getFsl() {
		return fsl;
	}



	public void setFsl(List<Farmer> fsl) {
		this.fsl = fsl;
	}



	@Override
	public String toString() {
		return "Machinary [machineId=" + machineId + ", farmerId=" + farmerId + ", ownerName=" + ownerName
				+ ", machineName=" + machineName + ", cost=" + cost + ", description=" + description + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", email=" + email + ", password=" + password + ", pic=" + pic
				+ ", fsl=" + fsl + "]";
	}

	

}