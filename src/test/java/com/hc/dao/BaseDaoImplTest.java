package com.hc.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseDaoImplTest {

	@Test
	public void testFindById() {
		UserDao dao = new UserDao();
		dao.findById(100);
	}

}
