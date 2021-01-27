package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.ProductDao;
import com.hcl.model.Product;
import com.hcl.model.UserProduct;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {

		return productDao.getAllProducts();
	}

	@Override
	public Product getProductById(int productid) {

		return productDao.getProductById(productid);
	}

	@Override
	public void saveUserProduct(Product product, UserProduct userProduct) {
		productDao.saveUserProduct(product, userProduct);

	}

	@Override
	public List<UserProduct> getProductsByUserId(int userid) {

		return productDao.getProductByUserId(userid);
	}

	@Override
	public void deleteUserProductById(int userproductid) {

		productDao.deleteUserProductById(userproductid);
	}

}
