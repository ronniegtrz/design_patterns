package state;
/**
 * @author Ronnie
 */
import java.util.HashMap;
import java.util.Random;


public abstract class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words; 
    private Random rand;

    public State (VocabularyList vocabularyList) {

    }

    public String getNextDefinition() {

    }

    public String getMatchingWord(String definition) {

    }

    public void IncreaseGrade() {

    }

    public void DecreaseGrade() {
        
    }
}
