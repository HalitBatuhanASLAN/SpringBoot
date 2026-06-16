package com.example.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springweb.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Test
	void testGetProduct(){
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1",Product.class);
	
		assertNotNull(product);
		assertEquals("asfasffasfaffasfdaf",product.getName());
		
	
	}
	
	@Test
	void testCreateProduct()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		Product product = new Product();
		product.setName("Samsung Mpbile");
		product.setDescription("Good");
		product.setPrice(100);
		Product newProduct = restTemplate.getForObject("http://localhost:8080/productapi/products/",Product.class);
	
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		
		assertEquals("Samsung Mpbile",newProduct.getName());
		
	}

	
	@Test
	void testUpdateProduct(){
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1",Product.class);
		product.setPrice(100000);
		
		restTemplate.put("http://localhost:8080/productapi/products/1", product);
	
	}
}
