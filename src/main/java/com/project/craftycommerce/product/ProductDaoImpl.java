package com.project.craftycommerce.product;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Product product) {
		String code=product.getCode();
        String name=product.getName();
        String description=product.getDescription();
        int unit_price=product.getUnit_price();
        int quantity=product.getQuantity();
        String image=product.getImage();
        Boolean available=product.isAvailable();
        String category_id=product.getCategory_id();
        String sql="insert into product(code,name,description,unit_price,quantity,image,available,category_id) values(?,?,?,?,?,?,?,?);";
        int rec=jdbcTemplate.update(sql,code,name,description,unit_price,quantity,image,available,category_id);
        return rec;
	}

	@Override
	public Product getById(int product_id) {
		String sql="select * from product where product_id=?;";
        Product product=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),product_id);
        return product;
	}

	@Override
	public int update(Product product, int product_id) {
		String code=product.getCode();
        String name=product.getName();
        String description=product.getDescription();
        int unit_price=product.getUnit_price();
        int quantity=product.getQuantity();
        String image=product.getImage();
        Boolean available=product.isAvailable();
        String category_id=product.getCategory_id();
        String sql = "update product set code=?,name=?,description=?,unit_price=?,quantity=?,image=?,available=?,category_id=? where product_id="+product_id+";";
        return jdbcTemplate.update(sql,new Object[] {code,name,description,unit_price,quantity,image,available,category_id});
       
	}

	@Override
	public int deleteById(int product_id) {
		
		String query = "delete from product where product_id="+product_id+";";
        return jdbcTemplate.update(query);

	}

	@Override
	public List<Product> getAllProducts() {
		String sql="select * from product;";
        List<Product>products=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
        return products;
	}
}

		

