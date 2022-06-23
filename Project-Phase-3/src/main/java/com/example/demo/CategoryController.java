package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao dao;
	
	@RequestMapping("/add")
	public ModelAndView insertcategory(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mv = new ModelAndView();
		category c = new category();
		c.setPname(req.getParameter("pname"));
		
		category cc = dao.insertcategory(c);
		
		if(cc!=null) {
			mv.setViewName("insertedCategory.jsp");
		}
		
		return mv;
		
	}
	
	

@RequestMapping("catall")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	List<category> list=dao.catall();
	mv.setViewName("DisplayCategory.jsp");
	mv.addObject("list", list);
	return mv;

	
}

@RequestMapping("/update")
public ModelAndView update(HttpServletRequest req, HttpServletResponse res) {
	
	ModelAndView mv = new ModelAndView();
	category c = new category();
	c.setId(Integer.parseInt(req.getParameter("id")));
	c.setPname(req.getParameter("pname"));
	
	category cc = dao.insertcategory(c);
	
	if(cc!=null) {
		mv.setViewName("insertedCategory.jsp");
	}
	
	return mv;
	
}



@RequestMapping("/deleteByid")
public ModelAndView deleteByid(HttpServletRequest req, HttpServletResponse res) {
	
	ModelAndView mv = new ModelAndView();
	category c = new category();
	c.setId(Integer.parseInt(req.getParameter("id")));
	category cc = dao.deleteByid(c);
	
	if(cc!=null) {
		mv.setViewName("insertedCategory.jsp");
	}
	
	return mv;
	
}


}
