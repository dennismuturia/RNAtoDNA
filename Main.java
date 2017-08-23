package com.company;
import java.util.Scanner;//This package is where the user will be used to input
import java.util.StringJoiner;

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

        //This will loop as it replaces the old Strings with new Value Strings I mean chars haha
        for(int i=0; i < splitStrings.length; i++){

            splitStrings[i].replace("G","C");
            splitStrings[i].replace("C","G");
            splitStrings[i].replace("T","A");
            splitStrings[i].replace("A","U");
        }
        //This Method joins back the split Strings back
        StringJoiner myString = new StringJoiner("");
        for(String s:splitStrings)myString.add(s);
            System.out.println(myString);

    }
}
