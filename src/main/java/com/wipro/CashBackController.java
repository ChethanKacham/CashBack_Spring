package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CashBackController {
	String custId;
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String Logging(String cid,String cpass,Model model)
	{
		custId=cid;
		CashBackService cb =new CashBackService();
		Customer customer=cb.ValidateLogin(cid);
		if(customer==null)
		{
			return "Nodata";
		}
		else if(customer.getPassword().equals(cpass))
		{
			model.addAttribute("balance",customer.getBalance());
			return "CouponPage";
		}
		else
		{
			return "Wrongpass";
		}
	}
	@RequestMapping(value="validatecoupon",method=RequestMethod.POST)
	public String ValidateCoupon(String ccode,Model model)
	{
		CashBackService cb =new CashBackService();
		Coupon coupon=cb.GetCoupon(ccode);
		Customer customer=cb.ValidateLogin(custId);
		double balance=customer.getBalance()*coupon.getOfferPercent()/100;
		double tbalance=customer.getBalance()+balance;
		System.out.println(tbalance);
		model.addAttribute("percent",coupon.getOfferPercent());
		model.addAttribute("tbalance",tbalance);
		return "CashBackSuccess";
	}

}
