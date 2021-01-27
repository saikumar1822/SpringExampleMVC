package com.hcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.User;

@Service
public interface LoginService {
	int save(User user);

	String validateUser(String username, String password);

	List<User> getAllEmployees();

	void deleteUserbyId(int userid);

	User findUserById(int userid);

	int updateUser(User user);

	public User findUserNmaeAndPassword(String username, String password);

}
