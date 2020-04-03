/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit9;

/**
 *
 * @author MCALAB01032
 */
import java.util.*; 


public class Box {
    int length;
    int breadth;
    int height;
    Box()
    {
        System.out.println("Enter the length,breadth and height of a box");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
    }
}

