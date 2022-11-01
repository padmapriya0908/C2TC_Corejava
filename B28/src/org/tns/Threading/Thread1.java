package org.tns.Threading;

public class Thread1 extends Thread 
{
	Table t;//declaration of variable t of class type table.
	Thread1(Table t)
	{
		this.t=t;
	}
public void run() 
{
	t.printTable(4);
}
}
