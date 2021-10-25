package com.wipro;

import org.springframework.orm.hibernate4.HibernateTemplate;


public class CashBackDao {
	HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public CashBackDao() {
		super();
	}
	public CashBackDao(HibernateTemplate template) {
		super();
		this.template = template;
	}
	public void saveCC(Customer customer){  
	    template.save(customer);  
	}
	public Customer ValidateLogin(String cid)
	{
		System.out.println(cid+"ret");
		Customer customer=(Customer)template.get(Customer.class,cid);
		return customer;
	}
	public Coupon GetCoupon(String ccode)
	{
		Coupon coupon=(Coupon)template.get(Coupon.class,ccode);
		return coupon;
	}
}
