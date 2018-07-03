package com.hc.bank;

public interface Bank {
	/**
	 *  功能： 银行转账
	 * @param from : 转出 账户
	 * @param to : 转入账户
	 * @param money : 金额
	 */
	@BankInfo(maxMoney=10000)
	public void transfer(String from, String to, double money) ;
}
