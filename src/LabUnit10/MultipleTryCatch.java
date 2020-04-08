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
import java.util.*;

public class MultipleTryCatch {
    public static void main(String args[]){
        try{
            
            int x=2;
            int y=5;
            int a[]={1,2,3,4};
            //System.out.println("Enter the array elements");

            String s="Hai";

            System.out.println("a["+x+"]="+a[x]);
            System.out.println("a["+y+"]="+a[y]);
            System.out.println("s[5]="+s.charAt(5));
            System.out.println("x/0="+(x/0));
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is no such index");
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println("there is no character at the required place");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Division by Zero is not possible");
        }
    }
}
