package com.kirning.android.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodInf {

	private int ID;
	private String foodName;
	private String foodPrice;
	private String foodShop;
	private String foodTalkID;
	private String foodLevel;
	private String foodImg;
	
	@Id
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodShop() {
		return foodShop;
	}
	public void setFoodShop(String foodShop) {
		this.foodShop = foodShop;
	}
	public String getFoodTalkID() {
		return foodTalkID;
	}
	public void setFoodTalkID(String foodTalkID) {
		this.foodTalkID = foodTalkID;
	}
	public String getFoodLevel() {
		return foodLevel;
	}
	public void setFoodLevel(String foodLevel) {
		this.foodLevel = foodLevel;
	}
	public String getFoodImg() {
		return foodImg;
	}
	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}
	
	

}
