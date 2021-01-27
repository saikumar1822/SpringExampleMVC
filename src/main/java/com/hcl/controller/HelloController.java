package com.hcl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.LoginForm;
import com.hcl.model.PasswordEncoder;
import com.hcl.model.User;
import com.hcl.service.LoginService;

@Controller
public class HelloController {
	@Autowired
	LoginService loginService;

	@RequestMapping("register")
	public String display(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "register";
	}

	@RequestMapping("hello")
	public String hello(Model model) {
		LoginForm loginForm = new LoginForm();
		model.addAttribute(loginForm);
		return "loginform";
	}

	@RequestMapping("loginform.html")
	public String processForm(@Valid @ModelAttribute LoginForm loginForm, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "loginform";
		}
		// loginForm.setPassword(PasswordEncoder.getEncodedString(loginForm.getPassword()));
		// System.out.println(loginForm.getPassword());
		String value = loginService.validateUser(loginForm.getUserName(), loginForm.getPassword());
		if (!value.equals(loginForm.getUserName())) {
			model.addAttribute("loginFailed", "invalid credentials..... pls try again");
			return "loginform";
		}
		List<User> userList = loginService.getAllEmployees();
		model.addAttribute("userList", userList);
		return "viewuserlist";
	}

	@RequestMapping("registerprocess")
	public String processRgister(@Valid @ModelAttribute User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "register";
		}
		user.setPassword(PasswordEncoder.getEncodedString(user.getPassword()));
		loginService.save(user);
		model.addAttribute(new LoginForm());
		return "loginform";
	}

	@RequestMapping("deleteuser")
	public ModelAndView deleteUser(@ModelAttribute User user) {
		System.out.println(user.getUserid());
		loginService.deleteUserbyId(user.getUserid());
		List<User> userList = loginService.getAllEmployees();
		return new ModelAndView("viewuserlist", "userList", userList);

	}

	@RequestMapping("edituser")
	public ModelAndView editUser(@ModelAttribute User user) {

		user = loginService.findUserById(user.getUserid());
		System.out.println(user.getUserid());

		return new ModelAndView("updateuser", "user", user);
	}

	@RequestMapping("edituserdetails")
	public ModelAndView updateUser(@Valid @ModelAttribute User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return new ModelAndView("updateuser", "user", user);
		}
		user.setPassword(PasswordEncoder.getEncodedString(user.getPassword()));
		loginService.updateUser(user);

		List<User> userList = loginService.getAllEmployees();
		return new ModelAndView("viewuserlist", "userList", userList);
	}
}
