import java.awt.*;

public class Giant extends Critter {
    private int moveCounter = 0;

    public Action getMove(CritterInfo info) {
        Action action;
        if(info.frontThreat()){
            action = Action.INFECT;
        } else if(info.getFront() == Neighbor.EMPTY){
            action = Action.HOP;
        } else {
            action = Action.RIGHT;
        }

        moveCounter++;
        return action;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if(moveCounter % 24 < 6)
            return "fee";
        if(moveCounter % 24 >= 6 && moveCounter % 24 < 12)
            return "fie";
        if(moveCounter % 24 >= 12 && moveCounter % 24 < 18)
            return "foe";
        return "fum";
    }
}
