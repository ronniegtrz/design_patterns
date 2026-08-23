package strategy;

import java.util.ArrayList;

public class Team 
{
    private String teamName;
    private ArrayList<Player> players;

    
    public Team(String teamName)
    {
        this.teamName = teamName; 
        this.players = new ArrayList<Player>();
    }

    
    public void addTeamMember(String firstName, String lastName, PlayerType playerType)
    {
        Player player;
        switch (playerType)
        {
            case GOALIE:
                player = new Goalie(firstName, lastName);
                break;
            case FORWARD:
                player = new Forward(firstName, lastName);
                break;
            case DEFENCE_MAN:
                player = new Defenceman(firstName, lastName);
                break;
            default:
                throw new IllegalArgumentException("Unknown player type: " + playerType);
        }
        players.add(player);
    }

    public void executePlay(PlayerType playerType)
    {
        for(Player p : players)
        {
            if (p.getPlayerType() == playerType)
            {
                System.out.println("\n--- " + p + " ---");
                System.out.println(p.play());
                System.out.println(p.getArt());
            }
        }
    }
    
    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    public String getName()
    {
        return teamName;
    }
}
