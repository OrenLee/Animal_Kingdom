import java.awt.*;

public class Bear extends Critter {
    private boolean sign = true;
    private boolean polar;

    public Bear(boolean polar){
        this.polar = polar;
    }

    public Action getMove(CritterInfo info) {
        Action action;

        if (info.frontThreat())
            action = Action.INFECT;
        else if (info.getFront() == Neighbor.EMPTY) {
            action = Action.HOP;
        } else {
            action = Action.RIGHT;
        }
        sign = !sign;
        return action;
    }

    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }

    public String toString() {
        return sign ? "/" : "\\";
    }
}
