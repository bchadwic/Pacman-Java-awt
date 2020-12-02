package entities;

import client.GameMap;
import javax.swing.*;


public class Character extends JLabel {

    // fields
    final int bounds = 50;
    final int moveAmount = 25;
    private int vector;
    private int x;
    private int y;
    char type;

    public int getVector() {
        return vector;
    }

    /**
     * Character represents a entity that is either the player or the foe in the game
     * @param x is the x coordinate that the Character is present
     * @param y is the y coordiante that the Character is present
     */
    public Character(int x, int y){
        this.setBounds(getSpacing(x),getSpacing(y),bounds,bounds);
        this.setVisible(true);
    }

    /**
     * getSpacing multiplies the coordinate by the appropriate square space designated
     * @param coord is the location that is being passed through
     * @return the coordinate multiplied by the appropriate spacing
     */
    public int getSpacing(int coord){
        return coord * bounds;
    }

    /**
     * setVector sets the direction the character is going
     * @param vector 0 = up, 1 = right, 2 = down, 3 = left
     */
    public void setVector(int vector) {
        this.vector = vector;
    }


    /**
     * move takes in the vector as a direction and moves the character based on the maps lay out
     * @param map is the game map the player resides on
     */
    public void move(GameMap map) {
        // take in the vector direction
        switch (getVector()) {
            case 0:
                // make sure the move is valid
                if (!((map.getIndex(getX() / bounds, getY()  / bounds - 1) == 'w'))) {
                    // move the character on the screen and in the map array
                    map.setIndex(getX() / bounds, getY() / bounds - 1, type);
                    setLocation(getX(), getY() - bounds);
                }
                break;
            case 1:
                if (!((map.getIndex(getX() / bounds + 1, getY() / bounds) == 'w'))) {
                    map.setIndex(getX() / bounds + 1, getY() / bounds, type);
                    setLocation(getX() + bounds, getY());
                }
                break;
            case 2:
                if (!((map.getIndex(getX() / bounds, getY() / bounds + 1) == 'w'))) {
                    map.setIndex(getX() / bounds, getY() / bounds + 1, type);
                    setLocation(getX(), getY() + bounds);
                }
                break;
            case 3:
                if (!((map.getIndex(getX() / bounds - 1, getY() / bounds) == 'w'))) {
                    map.setIndex(getX() / bounds - 1, getY() / bounds, type);
                    setLocation(getX() - bounds, getY());
                }
                break;
            }
    }

    // validateMove makes sure the move being made is lines up with the boards parameters
    public boolean validateMove(GameMap map) {
        /*return(this.getX() % 10 != 0 | this.getY() % 10 != 0);*/
        return false;
    }

    public void moveInArray(){

    }
}
