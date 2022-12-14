package com.project.craftycommerce.orderitem;

import java.util.Date;

public class OrderItem {
		private int order_item_id;
		private int cart_id;
		String order_status;
		String shipment_address;
		Date order_date;
		public OrderItem() {
			super();
			// TODO Auto-generated constructor stub
		}
		public OrderItem(int order_item_id, int cart_id, String order_status, String shipment_address,
				Date order_date) {
			super();
			this.order_item_id = order_item_id;
			this.cart_id = cart_id;
			this.order_status = order_status;
			this.shipment_address = shipment_address;
			this.order_date = order_date;
		}
		public int getOrder_item_id() {
			return order_item_id;
		}
		public void setOrder_item_id(int order_item_id) {
			this.order_item_id = order_item_id;
		}
		public int getCart_id() {
			return cart_id;
		}
		public void setCart_id(int cart_id) {
			this.cart_id = cart_id;
		}
		public String getOrder_status() {
			return order_status;
		}
		public void setOrder_status(String order_status) {
			this.order_status = order_status;
		}
		public String getShipment_address() {
			return shipment_address;
		}
		public void setShipment_address(String shipment_address) {
			this.shipment_address = shipment_address;
		}
		public Date getOrder_date() {
			return order_date;
		}
		public void setOrder_date(Date order_date) {
			this.order_date = order_date;
		}
}
