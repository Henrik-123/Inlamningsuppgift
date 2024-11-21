package Inlämningsuppgift;


public class Wordcounter {

    private int words;
    private int rows;
    private int characters;
    private String longestWord;
    boolean isRunning = true;

    public Wordcounter(){
        words = 0;
        rows = 0;
        characters = 0;
        longestWord = "";
    }

    public void addWord(String input) {
        if (input.equalsIgnoreCase("Stop")){
            endProgram();
        }else {
            String[] wordsArray = input.split(" ");

            for (int i = 0; i <= wordsArray.length - 1; i++) {
                if (wordsArray[i].length() > longestWord.length()) {
                    longestWord = wordsArray[i];
                }
                characters += wordsArray[i].length();
            }

            words += wordsArray.length;
            rows++;
        }

    }

    public int getRows() {
        return rows;
    }

    public int getWords() {
        return words;
    }

    public int getCharacters() {
        return characters;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void endProgram() {
        isRunning = false;
    }


}
