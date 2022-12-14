package com.project.craftycommerce.address;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDaoImpl implements AddressDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Address address) {
		int user_id=address.getUser_id();
        String address_line_one=address.getAddress_line_one();
        String address_line_two=address.getAddress_line_two();
        String city=address.getCity();
        String state=address.getState();
        String country=address.getCountry();
        String pin_code=address.getPin_code();
        String type=address.getType();
        String sql="insert into address(user_id,address_line_one,address_line_two,city,state,country,pin_code,type) values(?,?,?,?,?,?,?,?);";
        int rec=jdbcTemplate.update(sql,user_id,address_line_one,address_line_two,city,state,country,pin_code,type);
        return rec;
	}

	@Override
	public Address getById(int address_id) {
		String sql="select * from address where address_id=?;";
		Address address =jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Address.class),address_id);
        return address;
	}

	@Override
	public int update(Address address, int address_id) {
		
        String address_line_one=address.getAddress_line_one();
        String address_line_two=address.getAddress_line_two();
        String city=address.getCity();
        String state=address.getState();
        String country=address.getCountry();
        String pin_code=address.getPin_code();
        String type=address.getType();
        String sql = "update address set address_line_one=?,address_line_two=?,city=?,state=?,country=?,pin_code=?,type=? where address_id="+address_id+";";
        return jdbcTemplate.update(sql,new Object[] {address_line_one,address_line_two,city,state,country,pin_code,type});
       
	}

	@Override
	public int deleteById(int address_id) {
		
		String query = "delete from address where address_id="+address_id+";";
        return jdbcTemplate.update(query);

	}

	@Override
	public List<Address> getAllAddresses() {
		String sql="select * from address;";
        List<Address>addresses=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Address.class));
        return addresses;
	}
}


