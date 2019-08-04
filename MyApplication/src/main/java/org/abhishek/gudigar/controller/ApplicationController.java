package org.abhishek.gudigar.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.abhishek.gudigar.model.User;
import org.abhishek.gudigar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage";
	}
	
	@PostMapping("/saveuser")
	public String registerUser(@ModelAttribute User user, BindingResult bindingresult, HttpServletRequest request ) {
		userService.saveMyUser(user);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/showusers")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/deleteuser")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		userService.deleteUser(id);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/updateuser")
	public String updateuser(@RequestParam int id, HttpServletRequest request) {
		Optional<User> user = userService.updateUser(id);
		if (user.isPresent()) {
			request.setAttribute("user", user.get());
		}
		else {
			
		}
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomepage";
	}
	
	@RequestMapping("/loginuser")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username and/or password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomepage";
		}
	}
}
