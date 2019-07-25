package com.mjnari.spring.data;

import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.mjnari.spring.data.entities.Product;
import com.mjnari.spring.data.repos.ProductRepository;

import antlr.collections.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
		ProductRepository repository = context.getBean(ProductRepository.class);

		Product product = new Product();
		product.setId(2L);
		product.setName("Mac");
		product.setDescription("awesome");
		product.setPrice(1200d);
//		repository.save(product);
//		
//		Optional<Product> result = repository.findById(3L);
//		System.out.println(result);

//		result.setPrice(1500d); // this is a bug due to spring update, findById used to be findOne and now this no longer works

//		repository.saveAll(result); // this is a bug due to spring update, findById used to be findOne and now this no longer works

//		repository.findAll().forEach(p->{System.out.println(p.getPrice());});
		System.out.println(repository.findByName("Mac"));
		System.out.println(repository.findByPrice(1200d));
		System.out.println(repository.findByNameAndPrice("Mac", 1200d));


	}

}
