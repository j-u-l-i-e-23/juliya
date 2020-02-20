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

import java.util.*;

public class Room {
    int room_no;
    String room_type;
    double room_area;
    int Ac_machines;
    void setdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the room no,room type,roomarea and no.of ac machines");
        room_no=sc.nextInt();
        room_type=sc.next();
        room_area=sc.nextDouble();
        Ac_machines=sc.nextInt();
        
    }
    void displaydata()
    {
        System.out.println("Room Details");
        System.out.println("Room No:"+room_no);
        System.out.println("Room Type="+room_type);
        System.out.println("Room Area="+room_area);
        System.out.println("No.of AC machines:"+Ac_machines);
    }
    public static void main(String args[])
    {
        Room R=new Room();
        R.setdata();
        R.displaydata();
        
    }
    
}
