/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit2;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;
import java.lang.Math.*;
 public class Roots
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double d=(b*b)-(4*a*c);
		double d1=Math.sqrt(d);
		if(d>0)
		{
			System.out.println("First Root="+((-b+d1)/(2*a)));
			System.out.println("Second Root="+((-b-d1)/(2*a)));
			
		}
		else if(d==0)
			System.out.println("Roots="+(-b/2*a));
	}
}
