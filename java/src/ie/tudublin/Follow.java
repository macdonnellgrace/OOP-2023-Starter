package ie.tudublin;

public class Follow {

    // fields
    private String word;
    private int count;


    // accessor methods
    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    // constructor methods
    public void setWord(String word) {
        this.word = word;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }


    // string
    public String toString() {
        return "Count =" + count + " Word = " + word;
    }
    
}
