package org.tns.Threading;

public class Thread2 extends Thread
{
	Table t;//declaration of variable t of class type table.
	Thread2(Table t)
	{
		this.t=t;
	}
public void run() 
{
	t.printTable(5);
}
}
