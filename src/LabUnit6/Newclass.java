/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit6;

/**
 *
 * @author MCALAB01032
 */
interface I1
{
    int x=10;
    void add();
}

interface I2
{
    int x=20;
    void multiply();
}
public class Newclass implements I1,I2{
    public void add()
    {
        System.out.println("Sum="+(I1.x+I2.x));
    }
    public void multiply()
    {
        System.out.println("Product="+(I1.x*I2.x));
    }
    public static void main(String args[])
    {
        Newclass obj=new Newclass();
        obj.add();
        obj.multiply();
    }
    
}
