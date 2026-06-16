package com.example.summation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.service.SummationService;

@SpringBootTest
class SumOfNumbersApplicationTests {

	@Autowired
	SummationService service;
	
	@Test
	void summationTest()
	{
		int result = service.summation(10, 20);
		
		assertEquals(30, result);
	}

}
