package strategy;

public class BlockBehavior implements Behavior { //following the "rulebook" of Behavior"
    public String play() //making its own play method
    {
        return "blocked the defender"; 
    }

    public String getArt()
{
    String red = "\u001B[31m";  //color for the stick figures.
    String blue = "\u001B[34m";
    String reset = "\u001B[0m";

    return  "     " + red + "o" + reset + "  |             | " + blue + "o" + reset + "       | \\    \n" +
            "    " + red + "/|\\" + reset + " |             |" + blue + "/|\\" + reset + "      |  \\  \n" +
            "    " + red + "/ \\" + reset + "  \\ .         / " + blue + "/ \\" + reset + "      | _ \\ \n";
}
}
