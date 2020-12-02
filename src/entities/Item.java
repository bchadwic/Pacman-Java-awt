package entities;

import javax.swing.*;

public class Item extends JLabel {
    final int bounds = 50;

    /**
     * Item represents a non-character entity
     * @param x x coordinate
     * @param y y coordinate
     */
    public Item(int x, int y){
        this.setBounds(getSpacing(x),getSpacing(y),bounds,bounds);
        this.setVisible(true);
    }

    /**
     * getSpacing helps sets the bounds for the item based on the amount of spacing
     * @param coord coord is the coordinate passed for the x, y location of the item
     * @return int returns the coord with accurate representation of the spacing using bounds
     */
    public int getSpacing(int coord){
        return coord * bounds;
    }
}
