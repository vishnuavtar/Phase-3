package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BuyController {
	
	@Autowired
	BuyDao dao;
	
	@RequestMapping("/addbuy")
	public ModelAndView addbuy(HttpServletRequest req , HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Buy y = new Buy();
		y.setName(req.getParameter("name"));
		y.setFoodname(req.getParameter("foodname"));
		y.setPrice(req.getParameter("price"));
		y.setCname(req.getParameter("cname"));
		y.setAddress(req.getParameter("address"));
		y.setCardnumber(req.getParameter("cardnumber"));
		
		Buy yy = dao.addbuy(y);
		
		if(yy!=null) {
			mv.setViewName("BuySuccess.jsp");
		}
		
		return mv;
		
	}
	
	
	@RequestMapping("/allorder")
	public ModelAndView buyoption(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<Buy> list = dao.allorder();
		mv.setViewName("SHowAllOrder.jsp");
		mv.addObject("list", list);
		return mv;

		
	}
	

}
