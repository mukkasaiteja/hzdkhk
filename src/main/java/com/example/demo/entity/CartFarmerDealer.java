package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CartFarmerDealer {
	@Id
	@GeneratedValue
	private int cartId;
	private int farmerId;
	private int dealerId;
	private int cropId;
	private String pic;
	private String cropName;
	
	
	
	@OneToOne(targetEntity = Dealer.class)
	@JoinColumn(name="farmerId", insertable = false , updatable = false)
	private Farmer farmer;
	
	@OneToOne(targetEntity = Dealer.class)
	@JoinColumn(name="dealerId", insertable = false , updatable = false)
	private Dealer dealer;
	
	public CartFarmerDealer() {}

	public CartFarmerDealer(int cartId, int farmerId, int dealerId, int cropId, String pic, String cropName,
			Farmer farmer, Dealer dealer) {
		super();
		this.cartId = cartId;
		this.farmerId = farmerId;
		this.dealerId = dealerId;
		this.cropId = cropId;
		this.pic = pic;
		this.cropName = cropName;
		this.farmer = farmer;
		this.dealer = dealer;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	@Override
	public String toString() {
		return "CartFarmerDealer [cartId=" + cartId + ", farmerId=" + farmerId + ", dealerId=" + dealerId + ", cropId="
				+ cropId + ", pic=" + pic + ", cropName=" + cropName + ", farmer=" + farmer + ", dealer=" + dealer
				+ "]";
	}
	
	
	

	
}
