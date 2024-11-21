package Inlämningsuppgift;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class MainWordCounter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Wordcounter myWordCounter = new Wordcounter();

        System.out.println("Please type in as many words or sentences as you want. To quit enter Stop");

        String userInput;


        while(myWordCounter.isRunning){

            userInput = scan.nextLine();
            myWordCounter.addWord(userInput);


        }

        System.out.println("Number of words: " + myWordCounter.getWords());
        System.out.println("Number of rows: " + myWordCounter.getRows());
        System.out.println("Number of characters:Hej " + myWordCounter.getCharacters());
        System.out.println("Longest word: " + myWordCounter.getLongestWord());

    }



}
