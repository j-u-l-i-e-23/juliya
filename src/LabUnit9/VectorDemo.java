/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit9;

/**
 *
 * @author Me
 */
import java.util.*;

public class VectorDemo {
    public static void main(String ags[])
    {
        ArrayList arr=new ArrayList();
        arr.add(3);
        arr.add("Java");
        arr.add("Programs");
        Vector v=new Vector();
        v.add(4);
        v.addAll(1,arr);
        System.out.println("Vector v:"+v);
    }
}
