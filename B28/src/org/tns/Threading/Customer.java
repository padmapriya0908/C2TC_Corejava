package org.tns.Threading;

public class Customer extends Thread {
	int balance=20000;

	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Transcation started..!");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		for(int i=1;i<=3;i++)
		{
			balance = balance-1000;
			System.out.println("Withdraw is completed..!");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) 
			{
				
			}
			synchronized(this)
			{
				notify();
				for(i=1;i<=3;i++)
				{
					System.out.println("Transcation closed...!");
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						
					}
				}
			}
		}
	}

}
