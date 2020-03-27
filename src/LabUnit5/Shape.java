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


public class Shape {
    void draw()
    {
        System.out.println("Draw Shape()");
        
    }
    void erase()
    {
        System.out.println("Erase Shape()");
    }
       
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Draw Circle()");
    }
    void erase()
    {
        System.out.println("Erase Circle()");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Draw Tringle()");
    }
    void erase()
    {
        System.out.println("Erase Triangle()");
    }
}
class Square extends Shape
{
    void draw()
    {
        System.out.println("Draw Square()");
    }
    void erase()
    {
        System.out.println("Erase Square()");
    
    }
    public static void main(String args[])
    {
        //Shape s=new Shape();
        
       //s.draw();
       //s.erase();
        /*System.out.println("The Options Are:");
        System.out.println("1.Circle\n2.Tringle\n3.Square\nEnter your option");
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();*/
        Circle c=new Circle();
        Triangle t=new Triangle();
        Square S=new Square();
        //switch(op)
        //{
            //case 1:
                c.draw();
                c.erase();
               // break;
            //case 2:
                t.draw();
                t.erase();
               // break;
            //case 3:
                S.draw();
                S.erase();
               // break;
            //default:System.out.println("Invalid Option");
        //}
                
                
       
      
       
    }
}
    
    
    
    
    
    

