import java.awt.*;

public class NinjaCat extends Critter {
    public Action getMove(CritterInfo info) {
        if(info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        return Action.LEFT;
    }

    public Color getColor() {
        return Color.PINK;
    }

    public String toString() {
        return "Ninja";
    }
}
