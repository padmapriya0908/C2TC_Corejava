package org.tns.Threading;

public class InterTheardCommunication {
	public static void main(String[]args) {
		Customer c=new Customer();
		System.out.println("balance before the transcation is: "+ c.balance);
		c.start();
		try
		{
			synchronized(c)
			{
				c.wait();
			}
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("balance after the Transcation is: "+c.balance);
		
	}
	

}
