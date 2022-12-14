package com.project.craftycommerce.user;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(User user) {
		String fn=user.getFirst_name();
        String ln=user.getLast_name();
        String role=user.getRole();
        String password=user.getPassword();
        String email=user.getEmail();
        String contact_number=user.getContact_number();
        String sql="insert into user(first_name,last_name,role,password,email,contact_number) values(?,?,?,?,?,?);";
        int rec=jdbcTemplate.update(sql,fn,ln,role,password,email,contact_number);
        return rec;
	}

	@Override
	public User getById(int user_id) {
		String sql="select * from user where user_id=?;";
        User user=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(User.class),user_id);
        return user;
	}

	@Override
	public int update(User user, int user_id) {
		String fn=user.getFirst_name();
        String ln=user.getLast_name();
        String role=user.getRole();
        String password=user.getPassword();
        String email=user.getEmail();
        String contact_number=user.getContact_number();
        String sql = "update user set first_name=?,last_name=?,role=?,password=?,email=?,contact_number=? where user_id="+user_id+";";
        return jdbcTemplate.update(sql,new Object[] {fn,ln,role,password,email,contact_number});
       
	}

	@Override
	public int deleteById(int user_id) {
		
		String query = "delete from user where user_id="+user_id+";";
        return jdbcTemplate.update(query);

	}

	@Override
	public List<User> getAllUsers() {
		String sql="select * from user;";
        List<User>users=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(User.class));
        return users;
	}
}
