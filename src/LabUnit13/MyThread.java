/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit13;

/**
 *
 * @author Me
 */
class Base
{
    private int x;
    Base(int x)
    {
        this.x=x;
        for(int i=1;i<=10;i++)
            System.out.println(i+"*"+x+"="+(i*x));
    }
}
public class MyThread extends Base implements Runnable {
    int x;
    MyThread(int x)
    {
        
        super(2);
        this.x=x;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println(i+"*"+x+"="+(i*x));
        try{
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            
        }
        
    }
    
    public static void main(String args[])
    {
        MyThread m1=new MyThread(4);
        Thread t1=new Thread(m1);
        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception e)
        {
            
        }
    }
}
