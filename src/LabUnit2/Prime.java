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
public class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			count++;
		}
		if(count==2)
			System.out.println("Given Number Is Prime");
		else
			System.out.println("Not Prime");
	}
}
