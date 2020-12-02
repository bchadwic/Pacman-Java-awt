package entities;

import javax.swing.*;

public class Wall extends Item {

    private ImageIcon icon = new ImageIcon("src/icons/wall.png");

    /**
     * Wall represents an entity that forms the walls and the map
     * @param x x coordinate
     * @param y y coordinate
     */
    public Wall(int x, int y){
        super(x, y);
        this.setIcon(icon);
    }

}
