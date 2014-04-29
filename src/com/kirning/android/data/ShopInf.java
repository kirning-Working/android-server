package com.kirning.android.data;

import javax.persistence.Entity;

@Entity
public class ShopInf {
	
	private int id;
	private int shopName;
	private int shopIntroduce;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShopName() {
		return shopName;
	}
	public void setShopName(int shopName) {
		this.shopName = shopName;
	}
	public int getShopIntroduce() {
		return shopIntroduce;
	}
	public void setShopIntroduce(int shopIntroduce) {
		this.shopIntroduce = shopIntroduce;
	}
	
	

}
