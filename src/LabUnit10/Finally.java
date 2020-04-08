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

public class Finally {
    public static void main(String args[])
    {
        try{
            int y=3;
            int x[]=new int[y];
            x[y]=10;
            
        }
        catch(NegativeArraySizeException ex)
        {
            System.out.println("Negtive Size");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound");
        }
        finally
        {
            System.out.println("Block");
        }
    }
}
