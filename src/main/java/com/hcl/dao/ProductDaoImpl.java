    package com.hcl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.hcl.model.Product;
import com.hcl.model.UserProduct;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Product> getAllProducts() {
		return template.query("select * from product", new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> list = new ArrayList<Product>();
				while (rs.next()) {
					Product product = new Product();
					product.setProductid(rs.getInt(1));
					product.setProductname(rs.getString(2));
					product.setSize(rs.getInt(3));
					product.setPrice(rs.getInt(4));
					product.setDescription(rs.getString(5));
					list.add(product);
				}
				return list;
			}
		});
	}
 
	@Override
	public Product getProductById(int productid) {
		String sql = "select * from product where productid=?";
		return template.queryForObject(sql, new Object[] { productid },
				(rs, rownum) -> new Product(rs.getInt("productid"), rs.getString("productname"), rs.getInt("size"),
						rs.getInt("price"), rs.getString("description")

				));

	}

	@Override
	public void saveUserProduct(Product product, UserProduct userProduct) {
		String sql = "insert into user_product(productid,productname,size,price,description,userid) values ( ?,?,?,?,?,?)";
		template.update(sql, product.getProductid(), product.getProductname(), product.getSize(), product.getPrice(),
				product.getDescription(), userProduct.getUserid());

	}

	@Override
	public List<UserProduct> getProductByUserId(int userid) {
		return template.query("select * from user_product", new ResultSetExtractor<List<UserProduct>>() {

			public List<UserProduct> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<UserProduct> list = new ArrayList<UserProduct>();
				while (rs.next()) {
					UserProduct product = new UserProduct();
					product.setUserproductid(rs.getInt(1));
					product.setProductid(rs.getInt(2));
					product.setProductname(rs.getString(3));
					product.setSize(rs.getInt(4));
					product.setPrice(rs.getInt(5));
					product.setDescription(rs.getString(6));
					list.add(product);
				}
				return list;
			}
		});
	}

	@Override
	public void deleteUserProductById(int userproductid) {
		String SQL = "delete from user_product where userproductid = ?";
		template.update(SQL, userproductid);

	}

}
