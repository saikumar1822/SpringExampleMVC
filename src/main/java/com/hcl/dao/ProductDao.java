package com.hcl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcl.model.Product;
import com.hcl.model.UserProduct;

@Repository
public interface ProductDao {
	List<Product> getAllProducts();

	Product getProductById(int productid);

	void saveUserProduct(Product product, UserProduct userProduct);

	List<UserProduct> getProductByUserId(int userid);

	void deleteUserProductById(int userproductid);
}
