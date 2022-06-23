package com.example.demo;

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
public class AdminController {
	
	@Autowired
	AdminRepo repo;
	
	Logger log = Logger.getAnonymousLogger();
	
	@RequestMapping("/admin")
	public ModelAndView login(HttpServletRequest req , HttpServletResponse res ) {
		
		ModelAndView mv = new ModelAndView();
		
		
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		
		log.info("Value is set");
		
		if(repo.findbyname(user)!=null) {
			
			log.info("validation of the user is successful");
			
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			
			mv.setViewName("AdminPannel.jsp"); 
			
			
		}
		
		else {
			
			log.info("Password is wrong");
			mv.setViewName("userwrongpassword.jsp"); 
				
		}
	
	return mv;
	}
	

	
//	@ResponseBody
//	@RequestMapping("/logout")
//	public String logout(HttpServletRequest req , HttpServletResponse res ) {
//		
//		HttpSession session = req.getSession();
//		session.invalidate();
//		
//		return "LogOut Success"; 
//	}
	
	
	

}
