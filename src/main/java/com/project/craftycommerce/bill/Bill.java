package com.project.craftycommerce.bill;

public class Bill {
		private int bill_id;
		private int order_item_id;
		private int amount;
		public Bill() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bill(int bill_id, int order_item_id, int amount) {
			super();
			this.bill_id = bill_id;
			this.order_item_id = order_item_id;
			this.amount = amount;
		}
		public int getBill_id() {
			return bill_id;
		}
		public void setBill_id(int bill_id) {
			this.bill_id = bill_id;
		}
		public int getOrder_item_id() {
			return order_item_id;
		}
		public void setOrder_item_id(int order_item_id) {
			this.order_item_id = order_item_id;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
}
