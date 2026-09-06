package decorator;
import java.util.ArrayList;
/**
 * @author Ronnie
 * base decorator that wraps a player and adds gear on top of eachother
 */
public class GearAdder extends Player {
    public GearAdder(Player player, ArrayList<String> gear){
        super(player.character, player.getName());
        addGear(gear);
    }
    /**
     * merges the gears art into the players art line by line
     * @param gear
     */
    protected void addGear(ArrayList<String> gear) {
    for (int i = 0; i < gear.size() && i < character.size(); i++) {
        StringBuilder merged = new StringBuilder(character.get(i));
        String gearLine = gear.get(i);

        for (int j = 0; j < gearLine.length(); j++) {
            char c = gearLine.charAt(j);
            if (c != ' ') {
                if (j < merged.length()) {
                    merged.setCharAt(j, c);
                } else {
                    while (merged.length() < j) {
                        merged.append(' ');
                    }
                    merged.append(c);
                }
            }
        }
        character.set(i, merged.toString());
    }
    }
}