package ex41;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
public class nameSorter {
    //Create a class that takes in a file path for a desired text file.
    //I want each line of text to be an individual array element.
    public static String[] fileToString(String path){
        String names = null;

        try{
            names = new String(Files.readAllBytes(Paths.get(path)));
        } catch(IOException e){
            e.printStackTrace();
        }
        String[] newNames = names.split("\\r?\\n");
        return newNames;
    }


    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/ex41/exercise41_input.txt";
        String[] names = fileToString(filePath);

//need to put the names from the array in alphabetical order
        Arrays.sort(names);
//need to print the lines of the array
        System.out.print("The names are:\n");
        for(String line : names){
            System.out.println(line);
        }

    }
}