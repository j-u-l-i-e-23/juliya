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
//import java.io.IOException;
import java.util.*;

public class CreateDirectory {
    
    public static void main(String args[]) {
    System.out.println("Enter the path to create a directory: ");
    Scanner sc = new Scanner(System.in);
    String path = sc.next();
    System.out.println("Enter the name of directory: ");
    path = path+sc.next();
      
    File f = new File(path);
      
    boolean b = f.mkdir();
    if(b)
    {
        System.out.println("Directory created successfully");
    }else
    {
        System.out.println("Error!!");
    }
   }
}
