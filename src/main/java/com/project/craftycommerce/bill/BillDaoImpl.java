package com.project.craftycommerce.bill;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BillDaoImpl implements BillDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Bill bill) {
		
        int order_item_id=bill.getOrder_item_id();
        int amount=bill.getAmount();
        String sql="insert into bill(order_item_id,amount) values(?,?);";
        int rec=jdbcTemplate.update(sql,order_item_id,amount);
        return rec;
	}


	@Override
	public Bill getById(int order_item_id) {
		String sql="select * from bill where order_item_id=?;";
		Bill bill=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Bill.class),order_item_id);
        return bill;
	}


	@Override
	public int update(Bill bill, int bill_id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int deleteById(int bill_id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
