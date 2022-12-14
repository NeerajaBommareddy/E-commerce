package com.project.craftycommerce.user;

import java.util.List;

public interface UserDao {
	public int save(User user);
	   
    //Read
    public User getById(int user_id);
   
    //Update
    public int update(User user,int user_id);
   
    //Delete
    public int deleteById(int user_id);
   
    //Get All
    public List<User> getAllUsers();
}
