package com.project.craftycommerce.user;

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
public class UserController {

	@Autowired
    UserDaoImpl userDaoImpl;
   
    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        List<User> user=userDaoImpl.getAllUsers();
        return user;
       
    }
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        int rec=userDaoImpl.save(user);
        if(rec==1) {
            return "added successfully";
        }
        else {
            return "Check Syntax and values";
        }
    }
   
    @GetMapping("/user/{user_id}")
    public User getEmpbyId(@PathVariable int user_id) {
        User user=userDaoImpl.getById(user_id);
        return user;
    }
    @PutMapping("/edituser/{user_id}")
    public String updateEmp(@RequestBody User user,@PathVariable int user_id) {
        int rec=userDaoImpl.update(user, user_id);
        if(rec==1) {
            return "updated Sucessfully";
        }
        else{
            return "Check Values and code again";
        }
       
    }
    @DeleteMapping("/deleteuser/{user_id}")
    public String deleteEmp(@PathVariable int user_id) {
        int rec=userDaoImpl.deleteById(user_id);
       
        return "Deleted Successfully"+rec;
    }
}
