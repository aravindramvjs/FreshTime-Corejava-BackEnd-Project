package com.fssa.freshtime.utils;

import org.mindrot.jbcrypt.BCrypt;
public class PasswordUtil {
	public static String encryptPassword(String plainPassword) {
		return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
	}
}