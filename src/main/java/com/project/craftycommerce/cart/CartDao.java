package com.project.craftycommerce.cart;

import java.util.List;

import com.project.craftycommerce.product.Product;

public interface CartDao {
	public int save(Cart cart);
	   
    //Read
    public List<Cart> getById(int cart_id);

    public List<Product> getAllProductitems(int user_id);

	
		
}
