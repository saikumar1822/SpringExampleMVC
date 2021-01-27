package com.hcl.model;

public class UserProduct {
	private int userproductid;
	private int productid;
	private String productname;
	private int size;
	private int price;
	private String description;
	private int userid;
	
	public int getUserproductid() {
		return userproductid;
	}
	public void setUserproductid(int userproductid) {
		this.userproductid = userproductid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
