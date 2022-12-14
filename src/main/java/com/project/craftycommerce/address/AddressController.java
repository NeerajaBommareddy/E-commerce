package com.project.craftycommerce.address;

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
public class AddressController {
	@Autowired
	AddressDaoImpl addressDaoImpl;
   
    @GetMapping("/getAllAddresses")
    public List<Address> getAddresses(){
        List<Address> address=addressDaoImpl.getAllAddresses();
        return address;
       
    }
    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address) {
        int rec=addressDaoImpl.save(address);
        if(rec==1) {
            return "added successfully";
        }
        else {
            return "Check Syntax and values";
        }
    }
   
    @GetMapping("/address/{address_id}")
    public Address getEmpbyId(@PathVariable int address_id) {
    	Address address=addressDaoImpl.getById(address_id);
        return address;
    }
    @PutMapping("/editaddress/{address_id}")
    public String updateEmp(@RequestBody Address address,@PathVariable int address_id) {
        int rec=addressDaoImpl.update(address, address_id);
        if(rec==1) {
            return "updated Sucessfully";
        }
        else{
            return "Check Values and code again";
        }
       
    }
    @DeleteMapping("/deleteaddress/{address_id}")
    public String deleteEmp(@PathVariable int address_id) {
        int rec=addressDaoImpl.deleteById(address_id);
       
        return "Deleted Successfully"+rec;
    }

}
