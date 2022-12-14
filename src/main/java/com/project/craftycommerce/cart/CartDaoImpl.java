package com.project.craftycommerce.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.craftycommerce.product.Product;



@Repository
public class CartDaoImpl implements CartDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Cart cart) {
		int product_id=cart.getProduct_id();
        int user_id=cart.getUser_id();
        int quantity=cart.getQuantity();
        int cost=cart.getCost();
        String sql="insert into cart(produt_id,user_id,quantity,cost) values(?,?,?,?);";
        int rec=jdbcTemplate.update(sql,product_id,user_id,quantity,cost);
        return rec;
	}
	@Override
	public List<Cart> getById(int cart_id) {
		String sql="select * from cart where cart_id="+cart_id+";";
		List<Cart> cart=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Cart.class));
        return cart;
	}


	@Override
	public List<Product> getAllProductitems(int user_id) {
		String sql="select *from product where product_id in(select product_id from cart where cart.user_id="+user_id+");";
		List<Product> product=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
		return product;
	}
	

}
