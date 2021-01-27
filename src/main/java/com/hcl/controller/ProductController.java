package com.hcl.controller;

import java.io.IOException;
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
import com.hcl.model.Product;
import com.hcl.model.User;
import com.hcl.model.UserProduct;
import com.hcl.service.LoginService;
import com.hcl.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@Autowired
	LoginService loginService;

	@RequestMapping("userloginform")
	public String hello(Model model) {
		LoginForm loginForm = new LoginForm();
		model.addAttribute(loginForm);
		return "userlogin";
	}

	@RequestMapping("userlogin")
	public String processForm(@Valid @ModelAttribute LoginForm loginForm, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "userlogin";
		}
		loginForm.setPassword(PasswordEncoder.getEncodedString(loginForm.getPassword()));
		System.out.println(loginForm.getPassword());
		User value = loginService.findUserNmaeAndPassword(loginForm.getUserName(), loginForm.getPassword());
		if (!value.getUsername().equals(loginForm.getUserName())) {
			model.addAttribute("loginFailed", "invalid credentials..... pls try again");
			return "userlogin";
		}
		List<Product> products = productService.getAllProducts();
		model.addAttribute("userid", value.getUserid());
		model.addAttribute("products", products);
		return "viewProducts";
	}

	@RequestMapping("products")
	public ModelAndView viewAllProducts() {
		List<Product> products = productService.getAllProducts();
		return new ModelAndView("viewProducts", "products", products);
	}

	@RequestMapping("addProduct")
	public ModelAndView addProduct(@ModelAttribute UserProduct userProduct, Model model) {
		Product product = productService.getProductById(userProduct.getProductid());
		productService.saveUserProduct(product, userProduct);
		List<Product> products = productService.getAllProducts();

		model.addAttribute("key", "product added to cart and click on add for more products");
		model.addAttribute("userid", userProduct.getUserid());
		return new ModelAndView("viewProducts", "products", products);
	}

	@RequestMapping("userProducts")
	public ModelAndView userProducts(@ModelAttribute UserProduct userProduct) {
		List<UserProduct> products = productService.getProductsByUserId(userProduct.getUserid());
		return new ModelAndView("userproducts", "products", products);

	}

	@RequestMapping("deleteuserproduct")
	public ModelAndView deleteProducts(@ModelAttribute UserProduct userProduct) throws IOException {
		productService.deleteUserProductById(userProduct.getUserproductid());
		if(userProduct.getUserproductid()==0) {
			throw new IOException("this is exception");
	
		}
		List<UserProduct> products = productService.getProductsByUserId(userProduct.getUserid());
		return new ModelAndView("userproducts", "products", products);

	}

}
