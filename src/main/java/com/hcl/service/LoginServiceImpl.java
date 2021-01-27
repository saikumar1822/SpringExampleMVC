package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.LoginDaoInterf;
import com.hcl.model.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDaoInterf loginDao;

	@Override
	public int save(User user) {

		return loginDao.save(user);
	}

	@Override
	public String validateUser(String username, String password) {

		return loginDao.validateUser(username, password);
	}

	@Override
	public List<User> getAllEmployees() {

		return loginDao.getAllEmployees();
	}

	@Override
	public void deleteUserbyId(int userid) {
		loginDao.deleteUserbyId(userid);

	}

	@Override
	public User findUserById(int userid) {

		return loginDao.findUserById(userid);
	}

	@Override
	public int updateUser(User user) {

		return loginDao.updateUser(user);
	}

	@Override
	public User findUserNmaeAndPassword(String username, String password) {
		return loginDao.findUserNmaeAndPassword(username, password);
	}

}
