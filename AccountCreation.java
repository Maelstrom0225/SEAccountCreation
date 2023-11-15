/* SE Phase 3 AccountCreation Class
 * CS 3354.003
 * Michael Cantrell
 * 04/01/2022
 */

public class AccountCreation {
	public static final String VALID_INPUT = "Account Created.";
	public static final String INVALID_INPUT = "Invalid Format.";
	public static final String EXCEPTION_INPUT = "Account Exists.";
	public static final int MAX_USER_LENGTH = 15;
	private static final String[] DB_USERS = {"Tyler", "Jason"};
	
	public static boolean valid(String user, String pass) {
		int userLength = user.length();
		int passLength = pass.length();
		boolean upper, lower, num, max;
		upper = false;
		lower = false;
		num = false;
		max = false;
		
		if(userLength < MAX_USER_LENGTH) 
			max = true;
		
		for(int i = 0; i < passLength; i++) {
			if(Character.isUpperCase(pass.charAt(i))) 
				upper = true;
			if(Character.isLowerCase(pass.charAt(i)))
				lower = true;
			if(Character.isDigit(pass.charAt(i)))
				num = true;
		}
		
		if(max && upper && lower && num)
			return true;
		else
			return false;
	}
	
	public static boolean accntExists(String user) {
		// Imported from DB Manager 
		int DBSize = DB_USERS.length;
		for(int i = 0; i < DBSize; i++) {
			if(DB_USERS[i] == user)
				return false;
		}
		return true;
	}
	
	public static String createAccount(String user, String pass) {
		if(!valid(user, pass))
			return INVALID_INPUT;
		else if(!accntExists(user))
			return EXCEPTION_INPUT;
		else
			return VALID_INPUT;
	}
}
