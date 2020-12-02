package window;

import client.Game;
import client.GameMap;
import entities.Background;
import entities.Food;
import entities.Pacman;
import entities.Wall;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private JLayeredPane gamePanel;

    /**
     * Constructor calls setup, gameLayout
     */
    public GameWindow(){
        gamePanel = this.getLayeredPane();
        setup();
        gameLayout();
    }

    /**
     * Setup builds the windows properties
     */
    private void setup(){
        this.setTitle("Pacman");
        Image icon = Toolkit.getDefaultToolkit().getImage("src/icons/iconPacman.png");
        this.setIconImage(icon);
        this.setSize(765, 1038);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        gamePanel.setLayout(null);
    }

    /**
     * gameLayout builds the map
     */
    private void gameLayout(){
        gamePanel.add(new Background(), 7);
        setMap();
    }

    private void setMap(){
        for(int col=0; col<15; col++){
            for(int row=0; row<20; row++){
                if(GameMap.getIndex(col, row) == 'w'){
                    gamePanel.add(new Wall(col,row), 0);
                } } }

    }

    public JLayeredPane getGamePanel() {
        return gamePanel;
    }
}
