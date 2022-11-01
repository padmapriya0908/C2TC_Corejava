package org.tns.Threading;

public class Table {
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n * i);
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			
		}
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Table obj= new Table();
Thread1 t1=new Thread1(obj);
Thread2 t2=new Thread2(obj);
t1.start();
t2.start();
	}
}
