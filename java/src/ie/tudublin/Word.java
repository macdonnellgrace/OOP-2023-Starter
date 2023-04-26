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

    // find follow 
    public void findFollow(String str) {

        // for each word in the array list
        for (int i = 0; i < fields.size(); i++) {
        
            // gets current word in array
			Follow f = fields.get(i);
			
            // if the current word is equal to the string
			if (f.getWord() == str){
				
                // doesnt add new word and increases current words count
				f.setCount((f.getCount())+1);
				return;
			}
			else
			{
                // creates new word
				Follow newWord = new Follow(str, 1);
				fields.add(newWord);
			}
		}
    }

    // string
    public String toString() {
        return "Word ="  + " follows = " + word;
    }
    
}
