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

        for (int i = 0; i < fields.size(); i++) {
			Follow f = fields.get(i);
			
			if (f.getWord() == str){
				
				f.setCount((f.getCount())+1);
				return;
			}
			else
			{
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
