/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit15;

/**
 *
 * @author Me
 */
import java.util.*;

public class Multithread extends Thread{
    String msg[]=new String[30];
    //String msg[]={"java","is","hot","aromatic","and","invigorating"};
    Multithread(String msg[])
    {
        this.msg=msg;
    }
    public void run()
    {
        System.out.println("Message:");
        System.out.println("--------");
        for(int i=0;i<msg.length;i++)
          System.out.print(" "+msg[i]);
    }
    
}
class Multi extends Thread{
    int n[]=new int[4];
    Multi(int n[])
    {
        this.n=n;
    }
    public void run()
    {
      for(int i=0;i<4;i++)
          System.out.println(n[i]);
    }
}
class MyThread{
    public static void main(String args[])
    {
        int n[]={1,2,3,4};
               
        String s[]={"java","is","hot","aromatic","and","invigorating"};
        Multithread m1=new Multithread(s);
        Multi m2=new Multi(n);
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.start();
        t2.start();
        try{
            if(t1.isAlive())
                t1.join();
            if(t2.isAlive())
                t2.join();
        }
        catch(InterruptedException e)
        {
            
        }
    }
}
