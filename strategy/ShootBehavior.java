package strategy;

public class ShootBehavior implements Behavior{

    public String play()
    {
    return "shoots and scores!";
    }

    public String getArt()
{
    String blue = "\u001B[34m";
    String reset = "\u001B[0m";
    return "                                  \n" +
               "     /|                           \n" +
               "    / |              |  " + blue + "o" + reset + "         \n" +
               "   /  |              | " + blue + "/|\\" + reset + "       \n" +
               "  / _ |          -   / " + blue + "/ \\" + reset + "       \n";
}
}
