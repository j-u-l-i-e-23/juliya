/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit5;

/**
 *
 * @author MCALAB01032
 */
import java.util.*;

abstract class Shapes {
    abstract void read();
    abstract void volume();
    
}
class Cylinder extends Shapes
{
    float r,h;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height of Cylinder");
        r=sc.nextFloat();
        h=sc.nextFloat();
    }
    void volume()
    {
        double volume;
        volume=3.141*r*r*h;
        System.out.println("Volume of Cylinder="+volume);
        
    }
}
class Cube extends Shapes
{
    int a;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of cube");
        a=sc.nextInt();
        
    }
    void volume()
    {
        int v;
        v=a*a*a;
        System.out.println("Volume of Cube="+v);
        
    }
    public static void main(String args[])
    {
        Shapes s=new Cylinder();
        s.read();
        s.volume();
        Shapes s1=new Cube();
        s1.read();
        s1.volume();
        
    }
}