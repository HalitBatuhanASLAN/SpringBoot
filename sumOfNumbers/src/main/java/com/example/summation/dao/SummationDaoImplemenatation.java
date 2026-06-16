package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SummationDaoImplemenatation implements SummationDao {

	@Override
	public void save(int result)
	{
		System.out.println("DB kaydedildi");
	}
}
