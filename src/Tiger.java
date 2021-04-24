import java.awt.*;
import java.util.Random;

public class Tiger extends Critter{
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()){
            return Action.INFECT;
        } else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
            return Action.LEFT;
        } else if(info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        return Action.HOP;
    }

    public Color getColor() {
        int rand = new Random().nextInt(3);
        switch(rand){
            case 0: return Color.RED;
            case 1: return Color.GREEN;
            case 2: return Color.BLUE;
        }
        return Color.GREEN;
    }

    public String toString() {
        return "TGR";
    }
}

