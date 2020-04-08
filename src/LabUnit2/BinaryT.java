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
public class BinaryT
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n+1;i++)
		{
			System.out.println("1");
			if(i==n)
				break;
			System.out.print("1");
			for(int j=0;j<i;j++)
			{
				
					System.out.print("0");
				
				
			}
			
			//System.out.println();
		}
	}
}		
