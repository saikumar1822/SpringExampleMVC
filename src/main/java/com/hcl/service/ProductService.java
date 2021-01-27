package com.hcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.Product;
import com.hcl.model.UserProduct;

@Service
public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(int productid);

	void saveUserProduct(Product product, UserProduct userProduct);

	List<UserProduct> getProductsByUserId(int userid);

	void deleteUserProductById(int userproductid);
}
