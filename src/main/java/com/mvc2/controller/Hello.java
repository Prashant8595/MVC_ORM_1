package com.mvc2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc2.model.User;
import com.mvc2.service.UserService;



@Controller
public class Hello {
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonData(Model model) {
		System.out.println("Adding common data to model");
		model.addAttribute("Header", "code with Nishant");
		model.addAttribute("description", "this is my page of space of coding you can code with me");
	}
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello is working");
		return "home";
	}
	
	@RequestMapping("/hi")
	public String hi(Model model) {
		ArrayList<String>s= new ArrayList<String>();
		s.add("Rahul");
		s.add("Rakesh");
		s.add("Deepak");
		s.add("Vikram");
		s.add("prince");
		System.out.println("Hi is working");
		model.addAttribute("name", "Sahil");
		model.addAttribute("id", 250);
		model.addAttribute("email", "sameerkhan76950@gmail.com");
		model.addAttribute("fri", s);
		return "hi";
	}
	
	
	@RequestMapping("/check")
	public ModelAndView check() {
		
		ModelAndView modelAndView= new ModelAndView();
		
		modelAndView.addObject("name", "Rahul kumar");
		modelAndView.addObject("id", 240);
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}
	
	
	@RequestMapping("/contact")
	public String contactForm() {
		
		
		return "contact";
	}
	
	//it is use from chrome browser  via form
//	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String email,
//			@RequestParam("userName") String username, 
//			@RequestParam("password") String password,
//			Model model) {
//		
//		System.out.println("Email is" +request.getAttribute("email"));
//		System.out.println("Username is "+request.getAttribute("userName"));
//		System.out.println("Password is "+request.getAttribute("password"));
//		
//		User user= new User();
//		
//		user.setEmail(email);
//		user.setPassword(password);
//		user.setUserName(username);
//		
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(email);
//		
//		model.addAttribute("email", email);
//		model.addAttribute("userName", username);
//		model.addAttribute("password", password);
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
	

	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user) {
		
		userService.createUser(user);
		return "success";
	}

}
