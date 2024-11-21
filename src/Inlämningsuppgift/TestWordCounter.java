package Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordCounter {

    @Test
    public void testCountRow(){

        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Hej");

        int actual = myWordCounter.getRows();
        int expected = 1;

        assertEquals(expected, actual);


    }

    @Test
    public void testCharacterCounter(){

        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Det ska vara så!");

        int actual = myWordCounter.getCharacters();
        int expected = 13;

        assertEquals(expected, actual);

    }

    @Test
    public void testCountTwoRows(){

        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Hej");
        myWordCounter.addWord("Hejdå");


        int actual = myWordCounter.getRows();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void testGetWords(){

        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Hej");

        int actual = myWordCounter.getWords();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void testSentence(){

        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Hej på dig där");

        int actual = myWordCounter.getWords();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void testLongestWord(){
        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Jag har en väldigt stor katt");
        myWordCounter.addWord("LångtOrdUtanSpace");


        String expected = "LångtOrdUtanSpace";
        String actual = myWordCounter.getLongestWord();

        assertEquals(expected, actual);
    }

    @Test
    public void testEndProgram(){
        Wordcounter myWordCounter = new Wordcounter();
        String[] inputs = {"Jag vill avsluta programmet","stop","Den ska inte räkna med denna rad"};
        while(myWordCounter.isRunning){
            for (int i = 0; i < inputs.length -1;i++){
                myWordCounter.addWord(inputs[i]);
            }
        }

        int actual = myWordCounter.getRows();
        int expected = 1;

        assertEquals(expected, actual);


    }

    @Test
    public void testCountCharacters(){
        Wordcounter myWordCounter = new Wordcounter();

        myWordCounter.addWord("Ett två tre");
        int actual = myWordCounter.getCharacters();
        int expected = 9;

        assertEquals(expected, actual);


    }


}
