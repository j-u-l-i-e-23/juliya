/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit4;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;
class Ab
{
	int l;
	int b;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void display()
	{
		System.out.println("length="+l);
		System.out.println("breadth="+b);
	}
}
class Bc extends Ab
{
	void area()
	{
		float Area;
		Area=l*b;
		System.out.println("Area="+Area);

	}
}
class inherit
{
	public static void main(String args[])
	{
		Bc obj=new Bc();
		obj.read();
		obj.display();
		obj.area();
	}
}