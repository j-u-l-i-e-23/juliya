/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit8;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;
import p1.*;
public class ex1 extends ex2{
    void Read()
    {
        read();
    }
    void Display()
    {
        display();
        System.out.println("This is from class ex1");
        System.out.println("x="+(++x));
        System.out.println("Y="+(++y));
        
    }
    public static void main(String args[])
    {
        ex1 ob=new ex1();
        ob.Read();
        ob.Display();
    }
}
