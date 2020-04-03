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
public class Command{

    public static void main(String args[])
    {
        int sum=0;
        int count=0;
        for(int i=0;i<args.length;i++)
        {

        try
        {


                        sum=sum+Integer.parseInt(args[i]);
        }
        catch(NumberFormatException e)
        {
                count++;
        }


        }
        System.out.println("Sum"+sum);
        System.out.println("Count"+count);
        }
        }
