package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="LabourForCrop")
public class LabourForCrop {
	

	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int lCId;
	private int farmerId;
	private String cropName;
	private String work;
	private int money;
	private String address;
	private int labourId;
	
//	@OneToMany
//	@JoinColumn(name="farmerId")
//	Farmer farmer;
//	
//	@OneToMany
//	@JoinColumn(name="labourId")
//	Labour labour;
	
	@ManyToMany
	private List<Farmer> fsl=new ArrayList<>();
	
	public LabourForCrop() {
		
	}

	public LabourForCrop(int lCId, int farmerId, String cropName, String work, int money, String address,
			int labourId) {
		super();
		this.lCId = lCId;
		this.farmerId = farmerId;
		this.cropName = cropName;
		this.work = work;
		this.money = money;
		this.address = address;
		this.labourId = labourId;
	}

	public int getlCId() {
		return lCId;
	}

	public void setlCId(int lCId) {
		this.lCId = lCId;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public List<Farmer> getFsl() {
		return fsl;
	}

	public void setFsl(List<Farmer> fsl) {
		this.fsl = fsl;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLabourId() {
		return labourId;
	}

	public void setLabourId(int labourId) {
		this.labourId = labourId;
	}

	@Override
	public String toString() {
		return "LabourForCrop [lCId=" + lCId + ", farmerId=" + farmerId + ", cropName=" + cropName + ", work=" + work
				+ ", money=" + money + ", address=" + address + ", labourId=" + labourId + "]";
	}

	
}
