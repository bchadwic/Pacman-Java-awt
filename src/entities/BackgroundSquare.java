package entities;
import javax.swing.*;

public class BackgroundSquare extends JLabel {

    int bounds = 50;

    private ImageIcon background = new ImageIcon("src/icons/backgroundSquare.png");

    /**
     * BackgroundSquare represents an empty space on the board
     * @param x is the coordinate that the BackgroundSquare is present
     * @param y is the coordinate that the BackgroundSquare is present
     */
    public BackgroundSquare(int x, int y){
        this.setBounds(getSpacing(x),getSpacing(y),bounds,bounds);
        this.setIcon(background);
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

}
