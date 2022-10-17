package org.tns.oopsconcepts;

public class Commission {
		String Name;
		String Address;
		int Sales_amt;
		long phone_no;
		Commission(int amt,String name,String Addr,long no)//parameterized constructor
		{
			Sales_amt=amt;
			Name=name;
			Address=Addr;
			phone_no=no;
			{
			if(Sales_amt>=100000) {
				System.out.println("Commission is 10%");
				}
			else if(Sales_amt<100000) {
				System.out.println("Commission is 5%");
			}
			else if(Sales_amt<50000) {
				System.out.println("Commission is 3%");
			}
			else if(Sales_amt<30000) {
				System.out.println("No Commission");
			}
			}
				
			
		}
		public static void main(String[]args) 
		{
			Commission ob=new Commission(40000,"Priya","USA",876546378);
			System.out.println(ob.Sales_amt+" "+ob.Name+" "+ob.Address+" "+ob.phone_no);
		}
}
