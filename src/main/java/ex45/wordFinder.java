package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
public class wordFinder {



    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String filePath = "src/main/java/ex45/exercise45_input.txt";

        String sentence = fileToString(filePath);
        String newSentence = replaceWord(sentence);

        System.out.println("Enter a name for the output file: ");
        String filename = sc.nextLine();

        stringtoFile(newSentence,filename);

    }
    //create code to receive the path to a text file and return the contents as a string
    public static String fileToString(String path){
        String sentence = null;

        try{
            sentence = new String(Files.readAllBytes(Paths.get(path)));
        } catch(IOException e){
            e.printStackTrace();
        }

        return sentence;
    }
//create a class to search for the word "utilize" and replace it with "use"
    public static String replaceWord(String sentence){

        String newSentence;
        newSentence = sentence.replaceAll("utilize","use");

        return newSentence;

    }
//create a class to output the new string is a new text file
    public static void stringtoFile(String newSentence, String fileName) throws FileNotFoundException {

        String outputFile = fileName.trim();
        PrintWriter output = new PrintWriter( outputFile );

if (newSentence != null)
    output.print(newSentence);

output.close();
    }

}
