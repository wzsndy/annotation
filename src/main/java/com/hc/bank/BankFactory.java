package com.hc.bank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BankFactory {
	public static Bank getBank() {
		// return new BankImpl();
		Bank ret = null;
		final Bank bank = new BankImpl();
		ret = (Bank)Proxy.newProxyInstance(bank.getClass().getClassLoader(), 
				bank.getClass().getInterfaces(), 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						Object obj = null;
						if ("transfer".equals(method.getName())) {
							// 就是 transfer 
							BankInfo info = method.getAnnotation(BankInfo.class);
							System.out.println(info);
							double max = info.maxMoney();
							double money = (double)args[2];
							if (money >= max) {
								System.out.println("转账金额超过最大值 " + max + " " +money);
								throw new Exception("maxMoney reached");
							} else {
								obj = method.invoke(bank, args);
							}
						} else {
							obj = method.invoke(bank, args);
						}
						return obj;
					}
				});
		return ret;
	}

}
