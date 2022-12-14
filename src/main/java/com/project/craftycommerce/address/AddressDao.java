package com.project.craftycommerce.address;

import java.util.List;

public interface AddressDao {
	public int save(Address address);
	   
    //Read
    public Address getById(int address_id);
   
    //Update
    public int update(Address address ,int address_id);
   
    //Delete
    public int deleteById(int address_id);
   
    //Get All
    public List<Address> getAllAddresses();
}
