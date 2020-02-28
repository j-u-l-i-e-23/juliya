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
class Override
{
	void display()
	{
		System.out.println("This is Base class method");
	}
}
class B extends Override
{
	void display()
	{
		System.out.println("This is derived class method");
	}
}
class A
{
	public static void main(String args[])
	{
		//A obj=new A();
		B ob=new B();
		//obj.display();
		ob.display();
	}
}
