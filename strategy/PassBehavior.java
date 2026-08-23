package strategy;

public class PassBehavior implements Behavior {
    public String play()
    {
        return "passes to his teammate";
    }

    public String getArt()
{
    String blue = "\u001B[34m";
    String reset = "\u001B[0m";

    return "     " + blue + "o" + reset + " |                   | " + blue + "o" + reset + "          \n" +
           "    " + blue + "/|\\" + reset + "|                   |" + blue + "/|\\" + reset + "        \n" +
           "    " + blue + "/ \\" + reset + " \\           .      // " + blue + "\\" + reset + "        \n";
}
}
