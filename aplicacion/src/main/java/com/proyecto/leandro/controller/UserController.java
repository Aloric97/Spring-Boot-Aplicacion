package com.proyecto.leandro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.leandro.entity.User;
import com.proyecto.leandro.repository.RoleRepository;
import com.proyecto.leandro.repository.UserRepository;
import com.proyecto.leandro.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/")
	public String  index() {
		
		return "index";
	}
	
	@GetMapping("userForm")
	public String userForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("userlist", userService.getAllUsers());
		model.addAttribute("roles", roleRepository.findAll());
		
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	
	
	
}
