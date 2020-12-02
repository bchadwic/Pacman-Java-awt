package entities;


import client.GameMap;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ghost extends Character {

    private ImageIcon ghost = new ImageIcon("src/icons/ghost.png");
    char type = 'g';
    int alternateMove = 1;

    public Ghost(int x, int y, int vector){
        super(x,y);
        this.setIcon(ghost);
        setVector(vector);
    }

    public void kill(){

    }

    @Override
    public void setVector(int vector) {
        super.setVector(vector);
    }

    @Override
    public void move(GameMap map) {
        if (this.getX() == Pacman.staticX && this.getY() == Pacman.staticY) {
            Pacman.alive = false;
        } else {
            setVector(findVector(map));
            super.move(map);
        }

    }

    public int findVector(GameMap map) {
        /*if (Pacman.staticY / bounds >= this.getY() / bounds) {
            if ((map.getIndex(getX() / bounds, getY() / bounds - 1) == 'w')) {
                if (Pacman.staticX / bounds > this.getX() / bounds) {
                    return 1;
                } else if (Pacman.staticX / bounds == this.getX() / bounds)
                    return 2;
            } else
                return 2;
        } else {
            return 0;

        }
        System.out.println("default");
        return 0;*/
        if(alternateMove % 2 == 0){
            if (Pacman.staticY / bounds > this.getY() / bounds) {
                alternateMove = 1;
                return 2;
            } else {
                alternateMove = 1;
                return 0;
            }
        } else {
            if (Pacman.staticX / bounds > this.getX() / bounds){
                alternateMove = 2;
                return 1;
            } else {
                alternateMove = 2;
                return 3;
            }
        }
    }

}
