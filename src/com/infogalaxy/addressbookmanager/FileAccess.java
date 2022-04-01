package com.infogalaxy.addressbookmanager;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAccess {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("MyData.txt"));
            String data;
            while ((data = bufferedReader.readLine()) != null && !data.equalsIgnoreCase("null")) {
                System.out.println(data);
                String[] separetData = data.split(",");
                System.out.println("First Name = " + separetData[0]);
                System.out.println("Last Name = " + separetData[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


