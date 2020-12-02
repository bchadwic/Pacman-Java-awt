// TODO make a final variable width and height for all the classes to use
package entities;

import javax.swing.*;
import java.awt.*;

public class Background extends JLabel {

    // fields
    Rectangle borderSize = new Rectangle(750,1000);
    private ImageIcon backgroundIcon = new ImageIcon("src/icons/background.png");

    /**
     * Background represents the image that casts behind the game map / characters
     */
    public Background(){
        this.setIcon(backgroundIcon);
        this.setBounds(borderSize);
        this.setVisible(true);
    }
}
