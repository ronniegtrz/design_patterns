package singleton;

import java.util.Random;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 * @author Ronnie
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words; 


    private FlashCards() {
        rand = new Random();
        words = singleton.FileReader.getWords();
    }
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
            return flashCards; 
        } else {
            return flashCards;
        }
    }
    public Word getWord() {
        int index = rand.nextInt(words.size());
        return words.get(index);
    }
    
}
