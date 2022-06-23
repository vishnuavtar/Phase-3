package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	Userdao dao;
	
	Logger log = Logger.getAnonymousLogger();
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req , HttpServletResponse res ) {
		
		ModelAndView mv = new ModelAndView();
		
		
		String suser = req.getParameter("suser");
		String spassword = req.getParameter("spassword");
		
		log.info("Value is set");
		
		if(repo.findbyname(suser)!=null) {
			
			log.info("validation of the user is successful");
			
			HttpSession session = req.getSession();
			session.setAttribute("suser", suser);
			
			mv.setViewName("displayRegister.jsp"); 
			
			
		}
		
		else {
			
			log.info("Password is wrong");
			mv.setViewName("userwrongpassword.jsp"); 
				
		}
	
	return mv;
	}
	
	RestTemplate rest=new RestTemplate();
	@ResponseBody
	@RequestMapping("/register")
	public String register(HttpServletRequest req , HttpServletResponse res ) {
		
		String suser = req.getParameter("suser");
		String spassword = req.getParameter("spassword");  
		String semail = req.getParameter("semail");
		
		String url = "http://localhost:8081/register-user/"+suser+"/"+spassword+"/"+semail;
		
		rest.getForObject(url, String.class);
		
		return "success";
	
		
	}
	
	@ResponseBody
	@RequestMapping("/logout")
	public String logout(HttpServletRequest req , HttpServletResponse res ) {
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		return "LogOut Success"; 
	}
	
	
	

@RequestMapping("alluser")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	List<User> list=dao.alluser();
	mv.setViewName("AllUsers.jsp");
	mv.addObject("list", list);
	return mv;

	
}
	
	
	
	RestTemplate rest1=new RestTemplate();
	@ResponseBody
	@RequestMapping("/forget")
	public String forget(HttpServletRequest req , HttpServletResponse res ) {
		
		String suser = req.getParameter("suser");
		String spassword = req.getParameter("spassword");  
		String semail = req.getParameter("semail");
		
		String url = "http://localhost:8081/register-user/"+suser+"/"+spassword+"/"+semail;
		
		rest.getForObject(url, String.class);
		
		return "success";
	
		
	}
	

}
