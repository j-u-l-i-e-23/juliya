/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit12;

/**
 *
 * @author Me
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
    public static void main(String args[]) 
    {
        try {
            FileWriter writer = new FileWriter("Apple.txt", true);
            writer.write("Hello!!");
            writer.write("How Are You?!");
            writer.close();
            
            FileReader reader = new FileReader("Apple.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
