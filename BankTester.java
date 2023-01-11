package q1Inhaetance;
import java.util.*;

public class BankTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the Choise: ");
		System.out.println("1: Deposite");
		System.out.println("2: Withdraw");
		
		System.out.println("Choise the Option");
		int choise =sc.nextInt();
		if(choise==1)
		{
		
		
		System.out.println("Enter the Customer FirstName");
		String FirstName=sc.next();
		System.out.println("Enter the Custome Lastname");
		String LastName=sc.next();
		
		
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		System.out.println("Enter the Depositeammount");
		double givenBalance=sc.nextDouble();
		
		Customer c1=new Customer(FirstName," "+LastName);
		System.out.print(c1.firstName);
		System.out.println(c1.lastName);
		
		Account d=new Account();
		String result=d.deposite(balance,givenBalance);
		System.out.println("Current Balance: "+result);
		}
		else if(choise==2)
		{
			System.out.println(" Enter the Customer FirstName");
			String FirstName=sc.next();
			System.out.println("Enter the Custome Lastname");
			String LastName=sc.next();
			System.out.println("enter the balance");
			double balance=sc.nextDouble();
			System.out.println("Enter the WithDrawAmmount");
			double givenBalance=sc.nextDouble();
		
		Customer c2=new Customer(FirstName," "+LastName);
		System.out.print(c2.firstName);
		System.out.println(c2.lastName);
		
		Account d1=new Account();
		String result1=d1.withdraw(balance,givenBalance);
		System.out.println("CurrentBalance: "+result1);
		}

	}

}
