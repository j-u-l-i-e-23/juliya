/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit6;

/**
 *
 * @author MCALAB01032
 */

import java.util.*;

interface Test
{
    void square();
}

public class Arithmetic implements Test{
    int x;
    public void square()
    {
        x=10;
        System.out.println("Square of "+x+"="+(x*x));
    }
}
 class ToTestInt
{
    public static void main(String args[])
    {
        Test obj=new Arithmetic();
        obj.square();
    }
}