package strategy;

public class Forward extends Player {
    public Forward (String firstName, String lastName)
    {
        super(firstName, lastName, PlayerType.FORWARD); //super reaches Player to fill in the fields. 
    }
    
public void setBehavior()
{
    if (random.nextBoolean()) //chooses randomly using if/else so that the forward can shoot or pass. 
    {
        behavior = new PassBehavior();
    }
    else{
        behavior = new ShootBehavior();
    }
}

}


