package q1Inhaetance;

public class Account extends Customer {
	String customer;
	double balance;
	double givenBalance;
	int accountNo;
	float interestRate;
	
	String deposite(double balance, double givenBalance) {
		String s1=" ";
		s1+=balance+givenBalance;
		return s1;
		
	}
	String withdraw(double balance, double givenBalance) {
		
		String s=" ";
		if(balance>=givenBalance)
			s+=balance-givenBalance;
		else
			s=s+"Check Your Balance";
	
		return s;
		
		 
		
	}

}
