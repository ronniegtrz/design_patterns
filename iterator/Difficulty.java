package iterator;

public enum Difficulty {
    HARD("\u001B[31m"), 
    MEDIUM("\u001B[32m"),
    EASY("\u001B[33m");

    public String ASCII; 

    private Difficulty (String ascii) {
        
    }

}
