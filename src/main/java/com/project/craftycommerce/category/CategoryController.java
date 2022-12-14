package com.project.craftycommerce.category;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	   
	    @GetMapping("/getAllCategories")
	    public List<Category> getCategories(){
	        List<Category> category=categoryDaoImpl.getAllCategories();
	        return category;
	       
	    }
	    @PostMapping("/addCategory")
	    public String addCategory(@RequestBody Category category) {
	        int rec=categoryDaoImpl.save(category);
	        if(rec==1) {
	            return "added successfully";
	        }
	        else {
	            return "Check Syntax and values";
	        }
	    }
	   
	    @GetMapping("/category/{category_id}")
	    public Category getEmpbyId(@PathVariable int category_id) {
	    	Category category=categoryDaoImpl.getById(category_id);
	        return category;
	    }
	    @PutMapping("/editcategory/{category_id}")
	    public String updateEmp(@RequestBody Category category,@PathVariable int category_id) {
	        int rec=categoryDaoImpl.update(category, category_id);
	        if(rec==1) {
	            return "updated Sucessfully";
	        }
	        else{
	            return "Check Values and code again";
	        }
	       
	    }
	    @DeleteMapping("/deletecategory/{category_id}")
	    public String deleteEmp(@PathVariable int category_id) {
	        int rec=categoryDaoImpl.deleteById(category_id);
	       
	        return "Deleted Successfully"+rec;
	    }
	}


