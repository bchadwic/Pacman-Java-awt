package client;

import entities.BackgroundSquare;
import entities.Food;
import entities.Ghost;
import entities.Pacman;
import window.GameWindow;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;

import static java.awt.Event.*;

public class Game extends Thread {

    public static GameWindow gameSetup;
    public static GameMap map;
    /*Pacman player;*/
    /*Ghost ghost;*/
    int bounds = 50;


    public Game() {
        gameSetup = new GameWindow();
        map = new GameMap();
        /*player = new Pacman(7, 14,3);*/
        /*ghost = new Ghost(1,1,2);*/
        /*gameSetup.getGamePanel().add(player, 0);*/
        /*gameSetup.addKeyListener(this);*/

    }

    public void draw(){
        for(int col=1; col<14; col++){
            for(int row=1; row<19; row++){
                if (map.getIndex(col,row) == '*') {
                    gameSetup.getGamePanel().add(new Food(col, row), 3);
                } else if (map.getIndex(col,row) == 'e'){
                    gameSetup.getGamePanel().add(new BackgroundSquare(col, row), 2);
                }
            }
        }
    }

    @Override
    public void run() {

        while (true) {

            try {

                Thread.sleep(200);
            } catch (Exception e) {
            }
            draw();
            /*player.move(map);*/
            /*ghost.move(map);*/


        }

    }

    public static GameMap getMap(){
        return map;
    }


}
