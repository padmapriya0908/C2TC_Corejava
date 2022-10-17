package org.tns.oopsconcepts;

public class Bank {
	String account_no;
	String Name;
	String account_type;
	long Balance;
	Bank(String acc_no,String name,String acc_type,long balance)
	{
		account_no=acc_no;
		Name=name;
		account_type=acc_type;
		Balance=balance;
		//Method to open account
			System.out.println("Enter Account No: "+acc_no);
			System.out.println("Enter Account type: "+acc_type);
			System.out.println("Enter Name: "+name);
			System.out.println("Enter Balance: "+balance);
		}
	public Bank(double d) {
		// TODO Auto-generated constructor stub
	}
	//Method to display account details
	public void showAccount() {
		System.out.println("Name of the account holder: "+Name);
		System.out.println("Account no: "+account_no);
		System.out.println("Account type: "+account_type);
		System.out.println("Balance: "+Balance);
	}
	//Method to deposit money
	public void deposit()
	{
		long amt;
		amt=60000;
		System.out.println("Enter the amount you want to deposit: "+amt);
		if(Balance>=amt)
		{
			Balance=Balance-amt;
			System.out.println("Balance after withdrawal: "+Balance);
		}
		else {
			System.out.println("Your balance is less than"+amt+"\tTranscation failed....!!");
		}
	}
	public static void main(String[]args) 
	{
		Bank ob=new Bank("AF456787","Priya","Savings",200000);
		System.out.println(ob.account_no+" "+ob.account_type+" "+ob.Name+" "+ob.Balance);
		ob.deposit();
		ob.showAccount();
	}
	

}
