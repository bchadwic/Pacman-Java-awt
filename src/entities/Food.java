package entities;

import javax.swing.*;

public class Food extends Item {

    private ImageIcon icon = new ImageIcon("src/icons/food.png");

    /**
     * Food represents the item the pacman character is trying to get to earn points
     * @param x x coordinate
     * @param y y coordinate
     */
    public Food(int x, int y){
        super(x,y);
        this.setIcon(icon);
    }
}
