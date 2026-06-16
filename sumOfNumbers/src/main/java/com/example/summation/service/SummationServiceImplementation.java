package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SummationDao;

@Service
public class SummationServiceImplementation implements SummationService {

	@Autowired
	private SummationDao dao;
	
	public SummationDao getDao() {
		return dao;
	}
	
	public void setDao(SummationDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public int summation(int a, int b)
	{
		int result = a + b;
	
		dao.save(result);
		
		return result;
	}
}
