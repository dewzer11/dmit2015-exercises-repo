package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionTest {

	@Test
	public void testALL() {
		Account currentAccount = new Account(1122, 100, "George");
		currentAccount.deposit(30, "from mom");
		currentAccount.deposit(40, "from Girlfriend");
		currentAccount.deposit(50, "from ex-girlfriend");
		currentAccount.withdraw(5, "donation to redcross");
		currentAccount.withdraw(4, "coffee");
		currentAccount.withdraw(3, "candy");
		//check the account holder name "George"
		assertEquals("George", currentAccount.getName());
		//check the interest rate is 1.5
		//check the balance is
		//check the number of transaction is 6
		// check all 3 withdraw trans
		//check all
	}

}
