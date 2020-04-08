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
import java.util.*;
public class ThreadDemo implements Runnable 
{
    int x;
    ThreadDemo(int x)
    {
        this.x=x;
    }
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
            System.out.println(i+"*"+x+"="+(i*x));
        try{
            Thread.sleep(500);
        }catch(Exception e){
            
        }
    }
    public static void main(String args[])
    {
        ThreadDemo td1=new ThreadDemo(5);
        ThreadDemo td2=new ThreadDemo(4);
        Thread t1=new Thread(td1);
        Thread t2=new Thread(td2);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            
        }
    }
     
}
