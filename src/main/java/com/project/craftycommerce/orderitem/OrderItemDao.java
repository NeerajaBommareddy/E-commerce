package com.project.craftycommerce.orderitem;

import java.util.List;

import com.project.craftycommerce.product.Product;


public interface OrderItemDao {
	public int save(OrderItem orderItem);
	   
    //Read
    public OrderItem getById(int order_item_id);
   
    //Update
    public int update(OrderItem orderItem,int orderitem_id);
   
    //Delete
    public int deleteById(int order_item_id);
   
    //Get All
    public List<OrderItem> getAllOrderItems();
    
    //
    public List<Product> getAllOrdersByUser(int user_id);
		
}
