package com.project.craftycommerce.orderitem;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.project.craftycommerce.product.Product;


@RestController
public class OrderItemDaoImpl implements OrderItemDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(OrderItem orderItem) {
		
        int cart_id=orderItem.getCart_id();
        String status=orderItem.getOrder_status();
        String shipment_address=orderItem.getShipment_address();
        Date order_date=orderItem.getOrder_date();
        String sql="insert into order_Item(cart_id,status,shipment_address,order_date) values(?,?,?,?);";
        int rec=jdbcTemplate.update(sql,cart_id,status,shipment_address,order_date);
        return rec;
	}


	@Override
	public OrderItem getById(int order_item_id) {
		String sql="select * from order_item where order_item_id=?;";
		OrderItem orderItem=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(OrderItem.class),order_item_id);
        return orderItem;
	}

	@Override
	public int update(OrderItem orderItem, int order_item_id) {
        int cart_id=orderItem.getCart_id();
        String status=orderItem.getOrder_status();
        String shipment_address=orderItem.getShipment_address();
        Date order_date=orderItem.getOrder_date();
        String sql = "update order_item set cart_id=?,status=?,shipment_address=?,order_date=? where order_item_id="+order_item_id+";";
        return jdbcTemplate.update(sql,new Object[] {cart_id,status,shipment_address,order_date});
	}

	@Override
	public int deleteById(int order_item_id) {
		String query = "delete from order_item where order_item_id="+order_item_id+";";
        return jdbcTemplate.update(query);
	}

	@Override
	public List<OrderItem> getAllOrderItems() {
		String sql="select * from order_item;";
        List<OrderItem>orderItems=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(OrderItem.class));
        return orderItems;
	}


	@Override
	public List<Product> getAllOrdersByUser(int user_id) {
			String sql="select * from product p where p.product_id in(select product_id from cart c inner join order_item o where o.cart_id=c.cart_id and c.user_id=1);";
			 List<Product>productsOrdered=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
			return productsOrdered;
	}

}
