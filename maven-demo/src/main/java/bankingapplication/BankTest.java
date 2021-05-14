package bankingapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("bankdet.xml");
		BankAccount bank = (BankAccount) context.getBean("bank1");
		
		
		bank.getAccountId();
		bank.getAccountHolderName();
		bank.getAccountType();
		bank.getAccountBalance();
		
	}

}
