package client;

import entities.Ghost;
import entities.Pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static client.Game.gameSetup;

public class GhostThread extends Thread {

    Ghost foe;

    public GhostThread(int x, int y){
        foe = new Ghost(x, y,1);
        gameSetup.getGamePanel().add(foe, 0);

    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (Exception e){

            }
            foe.move(Game.getMap());
        }
    }

}
