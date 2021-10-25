package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CashBackService {
	
	public Customer ValidateLogin(String cid)
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 CashBackDao cbd=context.getBean("cashbackdao",CashBackDao.class);
		 Customer customer=cbd.ValidateLogin(cid);
		 return customer;
	}
	public Coupon GetCoupon(String ccode)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 CashBackDao cbd=context.getBean("cashbackdao",CashBackDao.class);
		Coupon coupon=cbd.GetCoupon(ccode);
		return coupon;
	}
}
