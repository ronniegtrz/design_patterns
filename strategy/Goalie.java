package strategy;


public class Goalie extends Player
{
    public Goalie(String firstName, String lastName)
    {
    super(firstName, lastName, PlayerType.GOALIE);
    }

    public void setBehavior()
{
    behavior = new BlockGoalBehavior();
}
}


