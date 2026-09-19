package singleton;

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

    public String getFlashCardFront() {
        return word;
    }

    public String getFlashCardBack() {
        return type + "\n" + definition + "\n" + sentence;
    }
}
