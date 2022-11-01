package org.tns.Threading;

public class MyThread2 extends Thread{
	public void run()
	{
		{
			for (int i=0;i<5;i++)
			{
				System.out.println("double_num"+(i*2));
			}
		}
	}

	}
