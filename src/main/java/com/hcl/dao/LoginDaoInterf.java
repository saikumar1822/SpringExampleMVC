package com.hcl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcl.model.User;

@Repository
public interface LoginDaoInterf {
	int save(User user);

	String validateUser(String username, String password);

	List<User> getAllEmployees();

	void deleteUserbyId(int userid);

	User findUserById(int userid);

	int updateUser(User user);

	public User findUserNmaeAndPassword(String username, String password);
}
