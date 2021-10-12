package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
public class wordFreqFinder {



    public static void main(String[] args){

        String filePath = "src/main/java/ex46/exercise46_input.txt";
        String[] words = fileToString(filePath);
printFrequency(words);
    }


    public static String[] fileToString(String path) {
        String words = null;

        try{
            words = new String(Files.readAllBytes(Paths.get(path)));
        } catch(IOException e){
            e.printStackTrace();
        }
        return words.split("\s");
    }

    public static void printFrequency(String[] words){
        int a =0;

        char[] A = new char[10];
        int b =0;
        char[] B = new char[10];
        int c =0;
        char[] C = new char[10];
        for(int i=0;i< words.length;i++) {

            if (Objects.equals(words[i], "badger")) {
                a++;
                A[i] = '*';
            } else if (Objects.equals(words[i], "mushroom")) {
                b++;
                B[i] = '*';
            } else if (Objects.equals(words[i], "snake")){
                c++;
                C[i] = '*';
        }
        }
        String newA = new String(A);
        String newB = new String(B);
        String newC = new String(C);

            System.out.format("badger: %s\nmushroom: %s\nsnake: %s %d",newA,newB,newC,c);
    }
}
