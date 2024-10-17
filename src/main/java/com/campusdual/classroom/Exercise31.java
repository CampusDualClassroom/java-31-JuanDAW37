package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {
        String file = "D:\\IdeaProjects\\java-31-JuanDAW37\\src\\main\\resources\\lorem.txt";
        readFile(file);
    }

    public static void readFile(String file) {
        BufferedReader buffer = null;
        try{
            String read ="";
            buffer = new BufferedReader(new FileReader(new File(file)));
            while ((read = buffer.readLine()) != null){
                System.out.println(read);
            }
            buffer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
