/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;
public class C1 {
    public double pi=3.141;
    public double r;
    protected void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r=sc.nextDouble();
    }
    public static void main(String args[])
    {
        C1 ob=new C1();
        ob.read();
    }
}
