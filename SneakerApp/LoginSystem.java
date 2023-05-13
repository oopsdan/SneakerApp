package oopsdan;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginSystem {
	// Define the default username and password
	private static final String USERNAME = "Admin";
	private static final String PASSWORD = "Admin";
	// Hash the default password using SHA-256
	private static final String HASHED_PASSWORD = hashPassword(PASSWORD);

	// Authenticate the user by checking if the entered username and password match the default values
	public static boolean authenticate(String username, String password) {
		return username.equals(USERNAME) && HASHED_PASSWORD.equals(hashPassword(password));
	}

	// Hash the password using SHA-256
	private static String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			return bytesToHex(digest);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Error hashing password: " + e.getMessage());
			return null;
		}
	}

	// Convert the hashed password from bytes to hexadecimal format
	private static String bytesToHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}
}
