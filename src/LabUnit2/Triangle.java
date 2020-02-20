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
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(n);
		for(int i=n;i>=0;i--)
		{	
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=i;k<=n;k++)
			System.out.print(k+"");
			System.out.println();
		}
	}
}

