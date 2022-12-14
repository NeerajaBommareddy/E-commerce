package com.project.craftycommerce.product;

public class Product {
	private int product_id;
	private String code;
	private String name;
	private String description;
	private int unit_price;
	private int quantity;
	private String image;
	private boolean available;
	private String category_id;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, String code, String name, String description, int unit_price, int quantity,
			String image, boolean available, String category_id) {
		super();
		this.product_id = product_id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.unit_price = unit_price;
		this.quantity = quantity;
		this.image = image;
		this.available = available;
		this.category_id = category_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvaiable(boolean available) {
		this.available = available;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
}
