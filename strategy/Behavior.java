package strategy;

public interface Behavior {
    String play(); //leave it to the players what play they will do.
    String getArt(); //the stick figures.
    //makes every class that implements Behavior has to have its own art. 
}
