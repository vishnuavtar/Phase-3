package com.example.demo;
import java.*;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class productcontroller {
	
	@Autowired
	productdao dao;
	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		product p=new product();
		p.setName(req.getParameter("name"));
		p.setPrice(req.getParameter("price"));
		p.setCategory(req.getParameter("category"));
		p.setModel(req.getParameter("model"));
		
		product pp=dao.insert(p);
		if(pp!=null) {
			mv.setViewName("status.jsp");
		}
		return mv;

	}
	

@RequestMapping("getall")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	List<product> list=dao.getall();
	mv.setViewName("display.jsp");
	mv.addObject("list", list);
	return mv;

	
}

}
