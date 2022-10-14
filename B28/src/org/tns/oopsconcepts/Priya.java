package org.tns.oopsconcepts;
/*
 * Multilevel Inheritance
 */
class Prathap 
{
	void display1()
	{
		System.out.println("Father");
	}
}
class Vani extends Prathap
{
	void display2()
	{
		System.out.println("Mother");
	}
}
class Priya extends Vani
{
	void display3()
	{
		System.out.println("Daughter");
	}
}
	