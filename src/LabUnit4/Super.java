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
class Student
{
	void message()
	{
		System.out.println("This is student class");
	}
}
class Person extends Student
{
	void message()
	{
		System.out.println("this is person class");

	}
	void display()
	{
		message();
		super.message();
	}
}
class Super
{
	public static void main(String args[])
	{
		Person p=new Person();
		p.display();
	}
}
