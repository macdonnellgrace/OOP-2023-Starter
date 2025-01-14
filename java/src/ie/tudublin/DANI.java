package ie.tudublin;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	// array list 
	public ArrayList<Follow> follows = new ArrayList<Follow>();
	
	// load file
	public void loadFile()
    {
		String[] s = loadStrings("small.txt"); // Load a text file into a String array
		String[] w;

		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			s[i] = s[i].toLowerCase(); // Convert a string to lower case 
			
			// for each word in the array
			for (int j = 0; j < s.length; j++)
			{
				w = split(s[i], ' ');
			
				//int count = findWord();
				Follow f = new Follow(w[j], 0);
				follows.add(f);

				f.toString();
			}	
			
		}
    }

    // find word 
    public void findWord(String str) {

        for (int i = 0; i < follows.size(); i++) {
			Follow f = follows.get(i);
			
			if (f.getWord() == str){
				
				f.setCount((f.getCount())+1);
				return;
			}
			else
			{
				Follow newWord = new Follow(str, 1);
				follows.add(newWord);
			} 
		}
    }

	// print model
	public void printModel(){
		for (int index = 0; index < follows.size(); index++) {
			Follow f = follows.get(index);

			println(f.getWord() + ":" + "(" + f.getCount() + ")");
			// print (..... + follows(word) + .....)	
		}
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
		for (int i = 0; i < 14; i++) {
			// pick random word
			sonnet[i] = "Empty";
			print(sonnet[i]);
			
		}
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();
		//follows.toString();
       
	}

	public void keyPressed() {
		//writeSonnet();
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		// prints for each line in the sonnet
		//for (int index = 0; index < 14; index++) {
			//text(sonnet[index],width / 2, height / 4);
			
		//}
		text("hello",width / 2, height / 4);

	}
}
