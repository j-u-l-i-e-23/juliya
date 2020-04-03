/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit10;

/**
 *
 * @author Me
 */
import java.io.IOException;

class ThrowsExample {
   void method(int num)throws ClassNotFoundException,IOException
   {
       if(num==1)
           throw new IOException("IOException occured");
       else
           throw new ClassNotFoundException("ClassNotFound Exception Occurred");
       
           
      
   }
}
public class Throws
{
    public static void main(String args[])
    {
        try{
            ThrowsExample ob=new ThrowsExample();
            ob.method(1);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
