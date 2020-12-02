package entities;

import client.GameMap;
import javax.swing.*;

import static entities.Mouth.CLOSE;
import static entities.Mouth.OPEN;


public class Pacman extends Character {


    private static ImageIcon closed = new ImageIcon("src/icons/closedPac.png");
    private static ImageIcon up = new ImageIcon("src/icons/upPac.png");
    private static ImageIcon right = new ImageIcon("src/icons/rightPac.png");
    private static ImageIcon down = new ImageIcon("src/icons/downPac.png");
    private static ImageIcon left = new ImageIcon("src/icons/leftPac.png");
    Mouth position = CLOSE;
    char type = 'p';
    public static int staticX;
    public static int staticY;
    public static boolean alive = true;

    /**
     * Pacman represents the player in the game
     * @param x is the x coordinate where pacman is present
     * @param y is the y coordinate where pacman is present
     * @param vector is the direction that pacman is moving '0' = up, '1' = right, '2' = down, '3' = left
     */
    public Pacman(int x, int y, int vector){
        super(x,y);
        this.setIcon(closed);
        setVector(vector);

    }

    /**
     * eat makes pacman's mouth open and close
     */
    public void eat(){
        // take in the vector to ensure the mouth opens the correct way
        if(position == CLOSE) {
            switch (this.getVector()) {
                case 0:
                    this.setIcon(up);
                    position = OPEN;
                    break;
                case 1:
                    this.setIcon(right);
                    position = OPEN;
                    break;
                case 2:
                    this.setIcon(down);
                    position = OPEN;
                    break;
                case 3:
                    this.setIcon(left);
                    position = OPEN;
                    break;
            }
        // if the mouth is closing, then no vector is needed
        } else {
            this.setIcon(closed);
            position = CLOSE;
        }
        // repaint the pacman
        this.repaint();
        this.revalidate();
    }

    @Override
    public void setVector(int vector) {
        super.setVector(vector);
    }

    public int getVector(){
        return super.getVector();
    }

    @Override
    public void move(GameMap map){
        if(alive) {
            super.move(map);
            this.eat();
            map.setIndex(getX() / bounds, getY() / bounds, 'e');
            staticX = getX();
            staticY = getY();
        } else
            this.hide();
       /* switch (this.getVector()) {
            case 0:
                // make sure the move is valid
                if ((map.getIndex(getX() / bounds, getY()  / bounds - 1) == 'g')) {
                    System.out.println("game over");
                    this.hide();
                }
                break;
            case 1:
                if ((map.getIndex(getX() / bounds + 1, getY() / bounds) == 'g')) {
                    System.out.println("game over");
                    this.hide();
                }
                break;
            case 2:
                if ((map.getIndex(getX() / bounds, getY() / bounds + 1) == 'g')) {
                    System.out.println("game over");
                    this.hide();
                }
                break;
            case 3:
                if ((map.getIndex(getX() / bounds - 1, getY() / bounds) == 'w')) {
                    System.out.println("game over");
                    this.hide();
                }
                break;*/
    }
}
