package strategy;

public class BlockGoalBehavior implements Behavior { //following the "rulebook"
    public String play()
    {
        return "Blocks the attacker from scoring!"; 
    }

    public String getArt()
{
    String blue = "\u001B[34m"; //codes that tell the terminal what color to print the text
    String red = "\u001B[31m";
    String reset = "\u001B[0m";
    // Making the stick figures blue or red for teams
    return "                                        \n" +
           "     /|                                 \n" +
           "    / |   " + blue + "\\o/" + reset + "  |             |  " + red + "o" + reset + "     \n" + // adding color and then reseting before it gets the hockey puck or continues. 
           "   /  |    " + blue + "|" + reset + "   |             | " + red + "-|-" + reset + "     \n" +
           "  /   |   " + blue + "/ \\" + reset + "   \\ .         /  " + red + "/ \\" + reset + "   \n" +
           " /____|                                  \n";
}
}
