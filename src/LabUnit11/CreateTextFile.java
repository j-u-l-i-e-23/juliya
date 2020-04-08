/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit11;

/**
 *
 * @author Me
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  
//import java.util.*;
public class CreateTextFile {
    public static void main(String args[])
    {
        boolean result;
        
        try
        {
        
        File f=new File("c:\\java\\abc.txt");
          
            result = f.createNewFile();  
            if(result)     
            {  
                System.out.println("file created ");  
                System.err.println("FileName:"+f.getName());
                System.out.println("Path:"+f.getPath());
                System.out.println("Absolute Path:"+f.getAbsolutePath());
                System.out.println("Directory:"+f.isDirectory());
                System.out.println("File:"+f.isFile());
            }  
            else  
            {  
                System.out.println("Exists:"+f.exists());
                System.out.println("File already exist at location: "+f.getCanonicalPath());  
            }  
        }   
            catch(IOException e)   
            {  
                e.printStackTrace();    
                
            }  
        
        
        
    }
}
