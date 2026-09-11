package state;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/**
 * @author Ronnie
 */

public abstract class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words; 
    private Random rand;
/**
 * leave words out since subclasses make that themselves
 */
    public State (VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.rand = new Random();
    }
/**
 * this is used to get the question being asked
 * 
 */
    public String getNextDefinition() {
        ArrayList<String> definitions = new ArrayList<>(words.keySet());
        int index = rand.nextInt(definitions.size());
        return definitions.get(index);
    }
/**
 * this is the answer to that question being asked. 
 */
    public String getMatchingWord(String definition) {
        return words.get(definition);
    }
/**
 * every state must write their own
 */
    public abstract void increaseGrade();


    public abstract void decreaseGrade();
}
