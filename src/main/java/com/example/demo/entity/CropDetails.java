package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CropSales")
public class CropDetails {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cropId;
	private String cropName;
	private String address;
	private String farmerName;
	//private String location;
	private long cost;
	private int estimation;
	private int quantity;
	private String pic;
	//private int dealerId;
		
		
	@ManyToOne
	@JoinColumn(name="farmerId")
	private Farmer former;
	
	public CropDetails() {

	}
	public CropDetails(int cropId, String cropName,String farmerName, String address, long cost, int estimation, int quantity, String pic,
			List<Farmer> listFCS, List<Dealer> listDCS) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.address = address;
		this.cost = cost;
		this.estimation = estimation;
		this.quantity = quantity;
		this.pic = pic;
		this.farmerName=farmerName;
//		this.listFCS = listFCS;
//		this.listDCS = listDCS;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getEstimation() {
		return estimation;
	}
	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
//	public List<Farmer> getListFCS() {
//		return listFCS;
//	}
//	public void setListFCS(List<Farmer> listFCS) {
//		this.listFCS = listFCS;
//	}
//	public List<Dealer> getListDCS() {
//		return listDCS;
//	}
//	public void setListDCS(List<Dealer> listDCS) {
//		this.listDCS = listDCS;
//	}
	
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	@Override
	public String toString() {
		return "CropDetails [cropId=" + cropId + ", cropName=" + cropName + ", address=" + address + ", farmerName="
				+ farmerName + ", cost=" + cost + ", estimation=" + estimation + ", quantity=" + quantity + ", pic="
				+ pic + ", former=" + former + "]";
	}
	
}