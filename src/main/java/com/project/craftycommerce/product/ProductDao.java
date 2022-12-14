package com.project.craftycommerce.product;

import java.util.List;

public interface ProductDao {
	public int save(Product product);
	   
    //Read
    public Product getById(int product_id);
   
    //Update
    public int update(Product product,int product_id);
   
    //Delete
    public int deleteById(int product_id);
   
    //Get All
    public List<Product> getAllProducts();
}
