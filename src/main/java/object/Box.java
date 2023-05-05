package object;

import java.util.ArrayList;
import java.util.Collections;

public class Box extends superObject implements Comparable<Box>,Cloneable{
    private int room;

    public Box(){

    }
    public Box(Box box) {
        this.room = box.room;
        this.solidArea = box.solidArea;
        this.setPosX(box.getPosX());
        this.setCollision(box.isCollision());
        this.setPosY(box.getPosY());
        this.setName(box.getName());
        this.setImage(box.getImage());
        this.setSolidAreaDefaultPosX(box.getSolidAreaDefaultPosX());
        this.setSolidAreaDefaultPosY(box.getSolidAreaDefaultPosY());

    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }


    public static ArrayList<Box> boxes = new ArrayList<Box>();
    public static ArrayList<Box> boxesCopy =new ArrayList<Box>(boxes);







    @Override
    public int compareTo(Box o) {
        final int HIGHER = 1;
        final int LOWER = -1;
        final int EQUAL = 0;
        if(this.room==o.room){
            return EQUAL;
        }
        if (this.room>o.room){
            return HIGHER;
        }
        if (this.room<o.room){
            return LOWER;
        }
        return 0;
    }


}
