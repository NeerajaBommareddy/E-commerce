package com.project.craftycommerce.category;

import java.util.List;

public interface CategoryDao {
	public int save(Category category);
	   
    //Read
    public Category getById(int category_id);
   
    //Update
    public int update(Category category,int category_id);
   
    //Delete
    public int deleteById(int category_id);
   
    //Get All
    public List<Category> getAllCategories();
		
	
}
