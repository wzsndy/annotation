package com.hc.dao;

public interface BaseDao<T> {
	public T findById(int id);
	public void insert(T t);
}
