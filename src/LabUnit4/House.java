/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit4;

/**
 *
 * @author MCALAB01032
 */
import LabUnit3.*;
class House extends Room{
    int room_no;
    String room_type;
    double room_area;
    boolean Ac_machines;
    //Room R=new Room();
        void create()
        {
		
           setdata();
        }
        void display()
        {
            displaydata();
        }
    public static void main(String args[])
    {
        House h=new House();
        h.create();
        h.display();
    }
        
}
