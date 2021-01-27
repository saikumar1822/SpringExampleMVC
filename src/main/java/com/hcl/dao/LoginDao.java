package com.hcl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hcl.model.User;

public class LoginDao implements LoginDaoInterf {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(User user) {
		String sql = "insert into user(username,password,firstname,lastname,email,address,phone) values (?, ?,?,?,?,?,?)";
		return template.update(sql, user.getUsername(), user.getPassword(), user.getFirstname(), user.getLastname(),
				user.getEmail(), user.getAddress(), user.getPhone());
	}

	public String validateUser(String username, String password) {
		String result = "";
		String sql = "select username from admin where username=? AND password=?";
		try {
			result = template.queryForObject(sql, new Object[] { username, password }, String.class);
		} catch (Exception e) {
			System.out.println("not found");

		}
		return result;

		}    
	
	
	public List<User> getAllEmployees(){  
		 return template.query("select * from user",new ResultSetExtractor<List<User>>(){  
		   
		     public List<User> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<User> list=new ArrayList<User>();  
		        while(rs.next()){  
		        User user=new User();  
		        user.setUserid(rs.getInt(1));
		        user.setUsername(rs.getString(2)); 
		       user.setPassword(rs.getString(3));
		        user.setFirstname(rs.getString(4));  
		        user.setLastname(rs.getString(5));  
		       user.setEmail(rs.getString(6));
		       user.setAddress(rs.getString(7));
		       user.setPhone(rs.getString(8));
		       list.add(user);
		        }  
		        return list;  
		        }  
		    });  
		  }

	public void deleteUserbyId(int userid) {
		
		String SQL = "delete from user where userid = ?";
	      template.update(SQL, userid);
	}  
	
	public User findUserById(int userid) {
		String sql="select * from user where userid=?";
		return template.queryForObject(sql,new Object[] {userid},(rs,rownum)->
		new User(
				rs.getInt("userid"),
				rs.getString("username"),
				rs.getString("password"),
				rs.getString("firstname"),
				rs.getString("lastname"),
				rs.getString("email"),
				rs.getString("address"),
				rs.getString("phone")
				));
	}
	
	public int updateUser(User user){    
	    String sql="update user set username=?,password=?,firstname=?,lastname=?,email=?,address=?,phone=? where userid=?";   
	    return template.update(sql,user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getEmail(),user.getAddress(),user.getPhone(),user.getUserid());    
	}
	
	public User findUserNmaeAndPassword(String username,String password) {
		String sql="select * from user where username=? AND password=?";
		return template.queryForObject(sql,new Object[] {username,password},(rs,rownum)->
		new User(
				rs.getInt("userid"),
				rs.getString("username"),
				rs.getString("password"),
				rs.getString("firstname"),
				rs.getString("lastname"),
				rs.getString("email"),
				rs.getString("address"),
				rs.getString("phone")
				));
	}
	

}
