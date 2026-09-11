package state;
import java.util.ArrayList;
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
        this.vocabularyList = vocabularyList;
        this.rand = new Random();
    }

    public String getNextDefinition() {
        ArrayList<String> definitons = new ArrayList<>(words.ketSet());
        int index = rand.nextInt(definitions.size());
        return definitions.get(index);
    }

    public String getMatchingWord(String definition) {
        return words.get(definition);
    }

    public abstract void IncreaseGrade() 


    public abstract void DecreaseGrade() 
}
