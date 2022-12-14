package com.project.craftycommerce.bill;

import java.util.List;


public interface BillDao {
	public int save(Bill bill);
	   
    //Read
    public Bill getById(int bill_id);
   
    //Update
    public int update(Bill bill,int bill_id);
   
    //Delete
    public int deleteById(int bill_id);
   
    //Get All
    public List<Bill> getAllBills();
		
}
