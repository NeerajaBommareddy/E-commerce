package com.project.craftycommerce.orderitem;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.craftycommerce.product.Product;


@RestController
public class OrderItemController {
	@Autowired
	OrderItemDaoImpl orderItemDaoImpl;
	   
	    @GetMapping("/getAllOrderItems")
	    public List<OrderItem> getOrderItems(){
	        List<OrderItem> orderItem=orderItemDaoImpl.getAllOrderItems();
	        return orderItem;
	       
	    }
	    @PostMapping("/addOrderItem")
	    public String addOrderItem(@RequestBody OrderItem orderItem) {
	        int rec=orderItemDaoImpl.save(orderItem);
	        if(rec==1) {
	            return "added successfully";
	        }
	        else {
	            return "Check Syntax and values";
	        }
	    }
	   
	    @GetMapping("/orderitem/{order_item_id}")
	    public OrderItem getEmpbyId(@PathVariable int order_item_id) {
	    	OrderItem orderItem=orderItemDaoImpl.getById(order_item_id);
	        return orderItem;
	    }
	    @PutMapping("/editorderitem/{order_item_id}")
	    public String updateEmp(@RequestBody OrderItem orderItem,@PathVariable int order_item_id) {
	        int rec=orderItemDaoImpl.update(orderItem, order_item_id);
	        if(rec==1) {
	            return "updated Sucessfully";
	        }
	        else{
	            return "Check Values and code again";
	        }
	       
	    }
	    @DeleteMapping("/deleteorderitem/{order_item_id}")
	    public String deleteEmp(@PathVariable int order_item_id) {
	        int rec=orderItemDaoImpl.deleteById(order_item_id);
	       
	        return "Deleted Successfully"+rec;
	    }
	    @GetMapping("/getallorderedproducts/{user_id}")
	    public List<Product> getOrderedproducts(@PathVariable int user_id){
	    	List<Product> product=orderItemDaoImpl.getAllOrdersByUser(user_id);
	    	return product;
	    }
}
