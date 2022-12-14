package com.project.craftycommerce.bill;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class BillController {
	@Autowired
	BillDaoImpl billDaoImpl;
	   
	   
	    @GetMapping("/bill/{order_item_id}")
	    public Bill getEmpbyId(@PathVariable int order_item_id) {
	    	Bill bill=billDaoImpl.getById(order_item_id);
	        return bill;
	    }
}
