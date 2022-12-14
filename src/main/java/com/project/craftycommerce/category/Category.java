package com.project.craftycommerce.category;

public class Category {
		private int category_id;
		private String name;
		private String description;
		private boolean available;
		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Category(int category_id, String name, String description, boolean available) {
			super();
			this.category_id = category_id;
			this.name = name;
			this.description = description;
			this.available = available;
		}
		public int getCategory_id() {
			return category_id;
		}
		public void setCategory_id(int category_id) {
			this.category_id = category_id;
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
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
		
		
}
