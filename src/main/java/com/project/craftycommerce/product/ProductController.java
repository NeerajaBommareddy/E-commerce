package com.project.craftycommerce.product;

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
public class ProductController {
	@Autowired
   ProductDaoImpl productDaoImpl;
   
    @GetMapping("/getAllProducts")
    public List<Product> getProducts(){
        List<Product> product=productDaoImpl.getAllProducts();
        return product;
       
    }
    @PostMapping("/addProduct")
    public String addUser(@RequestBody Product product) {
        int rec=productDaoImpl.save(product);
        if(rec==1) {
            return "added successfully";
        }
        else {
            return "Check Syntax and values";
        }
    }
   
    @GetMapping("/product/{product_id}")
    public Product getEmpbyId(@PathVariable int product_id) {
    	Product product=productDaoImpl.getById(product_id);
        return product;
    }
    @PutMapping("/editproduct/{product_id}")
    public String updateEmp(@RequestBody Product product,@PathVariable int product_id) {
        int rec=productDaoImpl.update(product, product_id);
        if(rec==1) {
            return "updated Sucessfully";
        }
        else{
            return "Check Values and code again";
        }
       
    }
    @DeleteMapping("/deleteproduct/{product_id}")
    public String deleteEmp(@PathVariable int product_id) {
        int rec=productDaoImpl.deleteById(product_id);
       
        return "Deleted Successfully"+rec;
    }
}


