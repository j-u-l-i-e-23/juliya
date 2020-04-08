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
import Mypack.*;

public class Circle extends C1 {
    double volume;
    
    void calculate()
    {
        read();
        volume=pi*r*r;
    }
    void display()
    {
        System.out.println("Radius="+r);
        System.out.println("Volume of Circle="+volume);
    }
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.calculate();
        c.display();
    }
}
