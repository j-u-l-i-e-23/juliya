/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit12;

/**
 *
 * @author Me
 */
import java.io.FileOutputStream;
public class OutputStreamClassDemo {
    public static void main(String args[])
    {
        try
        {    
             FileOutputStream f=new FileOutputStream("D:\\Pen.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes();//converting string into byte array    
             f.write(b);    
             f.close();    
             System.out.println("File Created Successfully");    
        }
        catch(Exception e)
            {
                System.out.println(e);
            }    
            
    }
}
