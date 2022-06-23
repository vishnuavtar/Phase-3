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
	
	@RequestMapping("/runningbuy")
	public ModelAndView buy(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mv = new ModelAndView();
		Buy y = new Buy();
		
		y.setName(req.getParameter("name"));
		y.setAddress(req.getParameter("address"));
		y.setModel(req.getParameter("model"));
		y.setSize(req.getParameter("size"));
		y.setStatus(req.getParameter("status"));
		y.setCardname(req.getParameter("cardname"));
		y.setAmmount(req.getParameter("ammount"));
		y.setCardnumber(req.getParameter("cardnumber"));
		y.setCcv(req.getParameter("ccv"));
		
		Buy yy = dao.buy(y);
		
		if(yy!=null) {
			mv.setViewName("buyseccuss.jsp");
		}
		
		return mv;
		
	}
	
	
	@RequestMapping("buyall")
	public ModelAndView buyall(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<Buy> list=dao.buyall();
		mv.setViewName("BuyDisplay.jsp");
		mv.addObject("list", list);
		return mv;

		
	}
}
