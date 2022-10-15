package org.tns.oopsconcepts;
/*
 * Method overloading
 */
public class Shape {

public static void volume(int s)
{
	int volume = (s*s*s);
	System.out.println("Volume of Cube is"+volume);
}
static void volume (int l,int b,int h)
{
	int volume = (l*b*h);
	System.out.println("Volume of Cuboid is"+volume);
}
void volume(float pi,int r)
{
	float volume=((4/3)*pi*r*r);
	System.out.println("Volume of Sphere is"+volume);
}
public static void main(String[] args) {
	volume(8);
	volume(7,3,6);
	volume(9,12,6);
}
	
}