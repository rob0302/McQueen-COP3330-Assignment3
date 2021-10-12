package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parsingData {
    public static String[] fileToString(String path){
        String names = null;

        try{
            names = new String(Files.readAllBytes(Paths.get(path)));
        } catch(IOException e){
            e.printStackTrace();
        }
        String[] newNames = names.split(",");
        return newNames;
    }

    public static void printTable(String[] data) {
        System.out.printf("%-10s %-10s %-10s\n-----------------------------\n","Last","First","Salary");
for(int i =0; i< data.length;i+=3) {

    System.out.printf("%-10s %-10s %-10s",data[i],data[i+1],data[i+2]);

}

    }

    public static void main(String[] args){
String filepath = "src/main/java/ex42/exercise42_input.txt";
String[] data = fileToString(filepath);
printTable(data);

        }
    }

