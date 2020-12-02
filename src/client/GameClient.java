package client;

public class GameClient {
    public static void main(String[] args) {
        Game newGame = new Game();
        GhostThread ghost1 = new GhostThread(1,1);
        /*GhostThread ghost2 = new GhostThread(7,1);
        GhostThread ghost3 = new GhostThread(3,6);*/
        PlayerThread newPlayer = new PlayerThread();
        newGame.start();
        ghost1.start();
        /*ghost2.start();
        ghost3.start();*/
        newPlayer.start();
    }
}
