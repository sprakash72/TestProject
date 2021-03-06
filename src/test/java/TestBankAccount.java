

import org.junit.Assert;
import org.junit.Test;

import com.jenkins.BankAccount;


public class TestBankAccount 
{

	@Test
	public void testDebitWithSufficientFunds() 
	{
		BankAccount account = new BankAccount (10);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount, 0);

	}
	
	@Test
	public void testDebitWithInsufficientFunds() 
	{
		BankAccount account = new BankAccount (10);
		double amount = account.debit(11);
		Assert.assertEquals(10.0, amount, 0);

	}
}
