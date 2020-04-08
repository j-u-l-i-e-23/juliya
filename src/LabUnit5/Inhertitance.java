/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit5;

/**
 *
 * @author Me
 */
class A
{
    int i,j;
    void showij()
    {
        System.out.println("i and j:"+i+" "+j);
        
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("K:"+k);
    }
    void sum()
    {
        System.out.println("i+j+k:"+(i+j+k));
    }
}
public class Inhertitance {
    public static void main(String args[])
    {
        A ob=new A();
        B obj=new B();
        ob.i=20;
        ob.j=10;
        System.out.println("Super");
        ob.showij();
        obj.i=2;
        obj.j=12;
        obj.k=10;
        System.out.println("Derived");
        obj.showij();
        obj.showk();
        System.out.println("Sum of i,j and k in derived class");
        obj.sum();
    }
}
