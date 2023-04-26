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

			println(s[i]);

			// for each word in the array
			for (int j = 0; j < s.length; j++)
			{
				w = split(s[i], ' ');
			
				Follow f = new Follow(w[j], j);
				follows.add(f);
				println(f);

				//follows.findFollow(w[j]);
			}
			
		}
    }

    // find follow 
    public void findWord(String str) {

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
		for (int index = 0; index < 14; index++) {
			//text(sonnet[index],width / 2, height / 4);
			text("hello",width / 2, height / 4);
		}

	}
}
