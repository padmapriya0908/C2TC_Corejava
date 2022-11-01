package org.tns.Threading;

public class ImplementRunnable
{
	public void run()
	{
		System.out.println("Runnable Interface");
	}
	public static void main(String[] args) 
	{
		ImplementRunnable t1=new ImplementRunnable();
		Thread t1 =new Thread(t);
		t1.start();
	}
}

