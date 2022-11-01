package org.tns.Threading;

public class MyThread1 extends Thread {
public void run()
{
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("sq_num "+(i*i));
		}
	}
}
}
