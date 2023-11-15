/* SE Phase 3 AccountCreation Test Cases
 * CS 3354.003
 * Michael Cantrell
 * 04/01/2022
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountCreationTestCases {

	@Test
	void accountCreationTestCase1() {
		assertEquals(AccountCreation.createAccount("James", "Thomas78"), "Account Created.");
	}

	@Test
	void accountCreationTestCase2() {
		assertEquals(AccountCreation.createAccount("James", "thomas78"), "Invalid Format.");
	}
	
	@Test
	void accountCreationTestCase3() {
		assertEquals(AccountCreation.createAccount("JamesenthanielTheThird", "Thomas78"), "Invalid Format.");
	}
	
	@Test
	void accountCreationTestCase4() {
		assertEquals(AccountCreation.createAccount("Tyler", "Thomas78"), "Account Exists.");
	}
}
