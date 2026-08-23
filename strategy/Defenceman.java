package strategy;

public class Defenceman extends Player //gets free methods from Player class.
{
    public Defenceman(String firstName, String lastName)
    {
        super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

    public void setBehavior()
    {
        behavior = new BlockBehavior();
    }
}
