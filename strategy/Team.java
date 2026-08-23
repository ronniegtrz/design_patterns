package strategy;

import java.util.ArrayList;

public class Team 
{
    private String teamName;
    private ArrayList<Player> players; //unlimited array that can hold any player subclass

    
    public Team(String teamName)
    {
        this.teamName = teamName; 
        this.players = new ArrayList<Player>(); //creates the empty arraylist.
    }

    
    public void addTeamMember(String firstName, String lastName, PlayerType playerType)
    {
        Player player; //empty box filled in by whatever case matches
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
                throw new IllegalArgumentException("Unknown player type: " + playerType); //a case where the player is unknown. 
        }
        players.add(player); // add that player to the list.
    }
    //finds the player matching playerType and prints their play
    public void executePlay(PlayerType playerType)
    {
        for(Player p : players) //checks each player one at a time.
        {
            if (p.getPlayerType() == playerType)//checks if player matches
            {
                System.out.println("\n--- " + p + " ---"); //calls p.toString
                System.out.println(p.play());//prints play
                System.out.println(p.getArt());//prints the art
            }
        }
    }
    
    public ArrayList<Player> getPlayers()//getter for players
    {
        return players;
    }

    public String getName() //getter for teamName
    {
        return teamName;
    }
}
