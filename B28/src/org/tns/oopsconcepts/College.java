package org.tns.oopsconcepts;
/*
 * Hierarchical Inheritance
 */
class College
{
	void displaynames()
	{
		System.out.println("This courses are available");
	}
}
class Pmc extends College
{
	void course1()
	{
		System.out.println("Java Fullstack & Software Testing");
	}
}
class Psv extends College
{
	void course2()
	{
		System.out.println("Cyber security");
	}
}
class Gce extends College
{
	void course3()
	{
		System.out.println("Block Chain Development");
	}
}