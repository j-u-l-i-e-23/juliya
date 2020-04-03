/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit9;

/**
 *
 * @author MCALAB01032
 */
public class Box3d extends Box
{
    void area()
    {
        float area=length*breadth;
        System.out.println("Area="+area);
    }
    void volume()
    {
        float volume=length*breadth*height;
        System.out.println("volume="+volume);
    }
    public static void main(String args[])
    {
        Box3d obj=new Box3d();
        obj.area();
        obj.volume();
        
    }
}
