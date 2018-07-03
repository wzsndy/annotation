package com.hc.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Override
	public T findById(int id) {
		// select * from user where id = ?
		// select * from items where id = ?
		// System.out.println(T.class);
		Type type = this.getClass().getGenericSuperclass();
		Type[] types = ((ParameterizedType)type).getActualTypeArguments();
		Class<?>  clazz = (Class<?>) types[0];

		System.out.println(clazz);
		System.out.println("select * from " + clazz.getName());
		return null;
	}

	@Override
	public void insert(T t) {
	}

}
