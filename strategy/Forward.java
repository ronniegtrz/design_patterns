package strategy;

public class Forward extends Player {
    public Forward (String firstName, String lastName)
    {
        super(firstName, lastName, PlayerType.FORWARD);
    }
    
public void setBehavior()
{
    if (random.nextBoolean())
    {
        behavior = new PassBehavior();
    }
    else{
        behavior = new ShootBehavior();
    }
}

}


