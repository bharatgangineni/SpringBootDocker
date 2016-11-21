package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartItemId;
	
	private String itemName;
	private float itemValue;
	private int itemQuantity;
	
	
	Cart() {
	}
	
	public Cart(String itemName) {
		this.itemName = itemName;
	}
	public long getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemValue() {
		return itemValue;
	}
	public void setItemValue(float itemValue) {
		this.itemValue = itemValue;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	@Override
	public String toString() {
		return "Cart [cartItemId=" + cartItemId + ", itemName=" + itemName
				+ ", itemValue=" + itemValue + ", itemQuantity=" + itemQuantity
				+ "]";
	}
	
	
}
