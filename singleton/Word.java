package singleton;
/**
 * 
 * @author Ronnie
 */
public class Word {
    private String word; 
    private String type;
    private String definition;
    private String sentence;
    
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
/**
 * 
 * the front of the card only returns the word
 */
    public String getFlashCardFront() {
        return word;
    }
/**
 * the back of the card returns the type, definition, and sentence.
 */
    public String getFlashCardBack() {
        return type + "\n" + definition + "\n" + sentence;
    }
}
