package com.bptn.course._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //Create a new object of this class
            FileWriter writer = new FileWriter("sample.txt");
            //Insert something into the file
            writer.write("This is a new file");
            System.out.println("File Created");
            //just like scanner close the writer
            writer.close();
            //Catch the general exception IOException
        } catch (IOException e) {
            System.out.println("Something went wrong while creating the file: ");
            e.printStackTrace();
        }


    }

}