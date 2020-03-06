/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;

public class ex2 {
    public int x;
    public int y;
    protected void read()
    {
        System.out.println("Enter the values of X and Y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
    }
    protected void display()
    {
        System.out.println("This is from package p1");
        System.out.println("x="+x);
        System.out.println("y="+y);
        
    }
    public static void main(String args[])
    {
        ex2 ob=new ex2();
        ob.read();
        ob.display();
    }
}
