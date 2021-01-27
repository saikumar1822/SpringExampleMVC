package com.hcl.model;

import java.util.Base64;

public class PasswordEncoder {
public static String getEncodedString(String password) {
	return Base64.getEncoder().encodeToString(password.getBytes());
	
}
}
