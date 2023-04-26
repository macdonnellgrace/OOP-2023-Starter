package ie.tudublin;

import java.util.ArrayList;

public class Word {

    // array list 
    public ArrayList<Follow> fields = new ArrayList<Follow>();

    private String word;
    // follows class 

    public String getWord() {
        return word;
    }

    // constructor methods
    public void setWord(String word) {
        this.word = word;
    }

    // string
    public String toString() {
        return "Word ="  + " follows = " + word;
    }
    
}
