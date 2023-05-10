package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dto.Product;
import com.repo.ProductRepo;
@Service
@EnableAspectJAutoProxy
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	
	@Transactional(propagation = Propagation.NEVER)
	
	
	public void savePointInfo(){
		//System.out.println(" Method started " + "savePointInfo()");
		for(int i=1;i<=10;i++) {
			Product product= new Product();		
			product.setId(i);
			product.setName("test"+String.valueOf(i));
			System.out.print(product);
			/*
			 * if(i==5) { throw new RuntimeException(); }
			 */
			productRepo.savepoint(product);
		}
		//System.out.println(" Method completed " + "savePointInfo()");
		
	}
}
