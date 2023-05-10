package com.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dto.Product;

@Repository
public class ProductRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.NEVER)
	public void savepoint(Product product) {

		System.out.println("Products were saved");
		String query = "INSERT INTO public.product(id, name) VALUES (?, ?)";
		Object obj[] = { product.getId(), product.getName() };
		jdbcTemplate.update(query, obj);
	}
}