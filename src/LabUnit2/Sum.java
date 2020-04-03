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
public class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Sum=0;
		int t=n;
		while(t!=0)
		{
			int rem=t%10;
			Sum=Sum+rem;
			t=t/10;
		}
		System.out.println("Sum of Digit "+n+"="+Sum);
	}
}

