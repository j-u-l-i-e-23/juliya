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
class Static
{
	static int var1=68,num;
	static String s1="Static Method",s2;
	
	
	static void display()
	{
		System.out.println("var1="+var1);
		System.out.println("String1="+s1);
	}
	static
	{
		System.out.println("Static Block");
		num=7;
		s2="Static Block";
	}
	public static void main(String args[])
	{
		Static s=new Static();
		s.display();
		System.out.println("var2="+num);
		System.out.println("String2="+s2);
	}
}
