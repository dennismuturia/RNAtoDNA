package com.company;
import java.util.Scanner;//This package is where the user will be used to input

public class Main {

    public static void main(String[] args) {
        //Welcome Statement
        System.out.println("RNA to DNA");

        //Initialize the scanner object. Scanner is used in the inputs
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String myDNA = myScanner.next().toUpperCase();

        //Create an array to hold The split strings as Split the String to separate chars
        String[] splitStrings = myDNA.split("");

        //Checking if it has split and displaying
        for(int i=0; i < splitStrings.length; i++){
            System.out.println(splitStrings[i]);
        }
    }
}
