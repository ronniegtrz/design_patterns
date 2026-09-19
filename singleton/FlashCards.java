package singleton;
import java.util.Random;
import java.io.FileReader;
import java.util.ArrayList;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words; 


    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords("words.txt");
    }
    public static FlashCards getInstance() {

    }
    public Word getWord() {
        
    }
    
}
