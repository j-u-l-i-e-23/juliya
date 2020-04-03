/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit3;

/**
 *
 * @author MCALAB01032
 */
public class Simpleobject {
    String str;
    Simpleobject(String str)
    {
        this.str=str;
        System.out.println(str);
    }
    public static void main(String args[])
    {
        String str="Hello";
        Simpleobject s=new Simpleobject(str);
    }
    }
    
