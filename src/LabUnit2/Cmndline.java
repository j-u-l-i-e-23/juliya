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
public class Cmndline
{
	public static void main(String args[])
	{
		System.out.println("Commandline Arguments Are");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}