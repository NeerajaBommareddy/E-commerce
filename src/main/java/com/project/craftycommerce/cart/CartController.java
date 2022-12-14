package com.project.craftycommerce.cart;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.project.craftycommerce.product.Product;


@RestController
public class CartController {
	@Autowired
	CartDaoImpl cartDaoImpl;
	   
	    
	   
	    @GetMapping("/cart/{cart_id}")
	    public List<Cart> getEmpbyId(@PathVariable int cart_id) {
	    	List<Cart> cart=cartDaoImpl.getById(cart_id);
	        return cart;
	    }
	    @GetMapping("/getAllProductitems/{user_id}")
	    public List<Product> getProductsforUser(@PathVariable int user_id){
	        List<Product> product=cartDaoImpl.getAllProductitems(user_id);
	        return product;
	       
	    }
	    
}
