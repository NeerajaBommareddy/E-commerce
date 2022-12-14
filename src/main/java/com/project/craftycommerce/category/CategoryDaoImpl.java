package com.project.craftycommerce.category;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Category category) {
		
        String name=category.getName();
        String description=category.getDescription();
        Boolean available=category.isAvailable();
        String sql="insert into category(name,description,available) values(?,?,?);";
        int rec=jdbcTemplate.update(sql,name,description,available);
        return rec;
	}


	@Override
	public Category getById(int category_id) {
		String sql="select * from category where category_id=?;";
		Category category=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Category.class),category_id);
        return category;
	}

	@Override
	public int update(Category category, int category_id) {
        String name=category.getName();
        String description=category.getDescription();
        Boolean available=category.isAvailable();
        String sql = "update category set name=?,description=?,available=? where category_id="+category_id+";";
        return jdbcTemplate.update(sql,new Object[] {name,description,available});
	}

	@Override
	public int deleteById(int category_id) {
		String query = "delete category,product from product inner join category on product.category_id=category.category_id and category.category_id="+category_id+";";
        return jdbcTemplate.update(query);
	}

	@Override
	public List<Category> getAllCategories() {
		String sql="select * from category;";
        List<Category>categories=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Category.class));
        return categories;
	}


}
