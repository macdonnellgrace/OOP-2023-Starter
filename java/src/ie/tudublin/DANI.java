package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

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
        Table table = loadTable("small.txt", "tsv");

		for (TableRow row:table.rows())
		{
			println(row);
		}
    }

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
