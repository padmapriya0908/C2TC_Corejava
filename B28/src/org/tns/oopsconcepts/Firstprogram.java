package org.tns.oopsconcepts;

public class Firstprogram
{
	int year_ofpurchase;// datamembers
	String make;
	int model;
	double cost;
	public void display1()//member function
	{
		System.out.println("yearof purs" + 2000);
		System.out.println("make" +"Suzuki");
	}
	void display2()
	{
		System.out.println("model" + 1999);
		System.out.println("make" + 500000);
	}
	public static void main(String[] args)
	{
		//TODo Auto-generatd method stub
		Firstprogram ob1=new Firstprogram();//object creation
		ob1.display1();
		ob1.display2();
	}
}
  
