package client;

import entities.Pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static client.Game.gameSetup;

public class PlayerThread extends Thread implements KeyListener {

    Pacman player;

    public PlayerThread(){
        player = new Pacman(7, 14,3);
        gameSetup.getGamePanel().add(player, 1);
        gameSetup.addKeyListener(this);
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(300);
            } catch (Exception e){

            }
            player.move(Game.getMap());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 38) {
            player.setVector(0);
        } else if (e.getKeyCode() == 39){
            player.setVector(1);
        } else if (e.getKeyCode()==40){
            player.setVector(2);
        } else if(e.getKeyCode() == 37) {
            player.setVector(3);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
