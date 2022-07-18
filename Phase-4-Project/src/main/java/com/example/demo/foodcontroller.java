package com.example.demo;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class foodcontroller {
	
	@Autowired
	fooddao dao;
	
	@RequestMapping("addfood")
	public ModelAndView addfood(HttpServletRequest req , HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		food f = new food();
		f.setFoodname(req.getParameter("foodname"));
		f.setPrice(req.getParameter("price"));
		food ff = dao.addfood(f);
		if(ff!=null) {
			mv.setViewName("FoodAddedSuccess.jsp");
		}
		
		return mv;
		
		
	}
	
	
	@RequestMapping("allfood")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<food> list=dao.allfood();
		mv.setViewName("ShowAllFood.jsp");
		mv.addObject("list", list);
		return mv;

		
	}
	
	
	@RequestMapping("deletefood")
	public ModelAndView deletefood(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		food f = new food();
		f.setId(Integer.parseInt(req.getParameter("id")));
		
		food ff = dao.deletefood(f);
		if(ff!=null) {
			mv.setViewName("Successdeletefood.jsp");
		}
		
		return mv;
	}
	
	
	@RequestMapping("UpdateFood")
	public ModelAndView UpdateFood(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		food f = new food();
		f.setFoodname(req.getParameter("foodname"));
		f.setPrice(req.getParameter("price"));
		f.setId(Integer.parseInt(req.getParameter("id")));
		
		food ff = dao.FoodUpdate(f);
		if(ff!=null) {
			mv.setViewName("SuccessFoodUpdate.jsp");
		}
		
		return mv;
	}
	
	
	
	@RequestMapping("/buyoption")
	public ModelAndView buyoption(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<food> list=dao.buyoption();
		mv.setViewName("BuyOption.jsp");
		mv.addObject("list", list);
		return mv;

		
	}
	

}
