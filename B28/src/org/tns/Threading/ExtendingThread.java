package org.tns.Threading;

public class ExtendingThread extends Thread{
	
public void run()
{
	System.out.println("Hello");
}
public static void main(String[] args) 
{
	ExtendingThread t= new ExtendingThread();
	t.start();// TODO Auto-generated method stub

	}

}
