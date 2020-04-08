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
public class RenameFile {
    public static void main(String args[])
    {
        boolean result;
        
        try
        {
        
        File f=new File("D:\\java\\OldFile.txt");
          
            result = f.createNewFile();  
            if(result)     
            {  
                System.out.println("file created ");  
                File f2=new File("D:\\java\\NewFile.txt");
                boolean b=f.renameTo(f2);
                if(b)
                    System.out.println("Renamed Successfully:)");
                else
                    System.out.println("Error!!There is already a File with the same name:(");
                
            }  
            else  
            {  
                System.out.println("Exists:"+f.exists());
                //System.out.println("File already exist at location: "+f.getCanonicalPath());  
                File f2=new File("D:\\java\\NewFile.txt");
                boolean b=f.renameTo(f2);
                if(b)
                    System.out.println("Renamed Successfully:)");
                else
                    System.out.println("Error!!There is already a File with the same name:(");
            } 
            
        }   
            catch(IOException e)   
            {  
                e.printStackTrace();    
                
            }  
        
        
        
    }
}
