package strategy;

import java.util.Random;

public abstract class Player //template that other classes that extend can use.
{
    private String firstName;// only Player can access these (private)
    private String lastName;
    protected Behavior behavior; //can be used in this class or another class that extends.
    protected Random random;
    protected PlayerType playerType;
    
    public Player (String firstName, String lastName, PlayerType playerType)
    {
        this.firstName = firstName; //this.-- the field on whichever object is being built
        this.lastName = lastName;//stores the parameter into this objects field
        this.playerType = playerType; 
        this.random =  new Random(); // gives this object its own random generator
        setBehavior();
    }
        
            public abstract void setBehavior(); //abstract meaning classes that inherit this method have to write their own script.

            public String play()
            {
            setBehavior(); //pick a new random behavior each time play is called
            return firstName + " " + lastName + " " + behavior.play();
            }
            
            @Override
            public String toString() //toString so that the player doesnt print with weird letters.
            {
                return playerType.label + " " + firstName + " " + lastName; 
            }

            public PlayerType getPlayerType() //getter for playerType
            {
                return playerType;
            }

            public String getArt() //asks for the art for the behavior. 
            {
                return behavior.getArt();

            }
}
