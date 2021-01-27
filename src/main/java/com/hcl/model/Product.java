package com.hcl.model;

public class Product {
	private int productid;
	private String productname;
	private int size;
	private int price;
	private String description;
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
	public Product(int productid, String productname, int size, int price, String description) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.size = size;
		this.price = price;
		this.description = description;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
}
