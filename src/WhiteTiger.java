import java.awt.*;

public class WhiteTiger extends Tiger {
    private boolean infected = false;

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()){
            infected = true;
            return Action.INFECT;
        } else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
            return Action.LEFT;
        } else if(info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        return Action.HOP;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return infected ? "TGR" : "tgr";
    }
}

