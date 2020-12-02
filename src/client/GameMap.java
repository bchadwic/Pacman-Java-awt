package client;

/**
 * This class represents a map that is laid out for pacman to navigate
 */
public class GameMap {

    /**
     * the field map shows what the board looks like when it first starts
     * this field gets manipulated as pacman and the ghosts move around on the board
     * 'w' is the wall, 'e' is empty, '*' is food, 'g' is ghost, and 'p' is pacman
     */
    private static char[][] map = new char[][]{
            /*1*/  {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
            /*2*/  {'w', 'g', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', 'w'},
            /*3*/  {'w', '*', 'w', 'w', 'w', '*', 'w', 'w', 'w', '*', 'w', 'w', 'w', '*', 'w'},
            /*4*/  {'w', '*', '*', 'w', '*', '*', '*', '*', '*', '*', '*', 'w', '*', '*', 'w'},
            /*5*/  {'w', 'w', '*', '*', '*', '*', 'w', 'w', 'w', '*', '*', '*', '*', 'w', 'w'},
            /*6*/  {'e', 'w', '*', 'w', '*', '*', '*', '*', '*', '*', '*', 'w', '*', 'w', 'e'},
            /*7*/  {'w', 'w', '*', 'w', 'w', '*', 'w', 'e', 'w', '*', 'w', 'w', '*', 'w', 'w'},
            /*8*/  {'e', 'e', '*', 'w', '*', '*', 'w', 'e', 'w', '*', '*', 'w', '*', 'e', 'e'},
            /*9*/  {'w', 'w', '*', '*', '*', 'w', 'w', 'e', 'w', 'w', '*', '*', '*', 'w', 'w'},
            /*10*/ {'e', 'w', '*', 'w', '*', 'w', 'e', 'e', 'e', 'w', '*', 'w', '*', 'w', 'e'},
            /*11*/ {'e', 'w', '*', 'w', '*', 'w', 'e', 'e', 'e', 'w', '*', 'w', '*', 'w', 'e'},
            /*12*/ {'w', 'w', '*', '*', '*', 'w', 'w', 'w', 'w', 'w', '*', '*', '*', 'w', 'w'},
            /*13*/ {'e', 'e', '*', 'w', '*', '*', '*', '*', '*', '*', '*', 'w', '*', 'e', 'e'},
            /*14*/ {'w', 'w', '*', 'w', '*', 'w', 'w', 'w', 'w', 'w', '*', 'w', '*', 'w', 'w'},
            /*15*/ {'e', 'w', '*', 'w', '*', '*', '*', 'p', '*', '*', '*', 'w', '*', 'w', 'e'},
            /*16*/ {'w', 'w', '*', '*', '*', 'w', '*', 'w', '*', 'w', '*', '*', '*', 'w', 'w'},
            /*17*/ {'w', '*', '*', 'w', '*', '*', '*', 'w', '*', '*', '*', 'w', '*', '*', 'w'},
            /*18*/ {'w', '*', 'w', 'w', 'w', '*', 'w', 'w', 'w', '*', 'w', 'w', 'w', '*', 'w'},
            /*19*/ {'w', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', 'w'},
            /*20*/ {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}
    };


    /**
     * getMap returns the static map so it can be manipulated as the characters roam
     * @return getMap returns the char map array
     */
    public static char[][] getMap() {
        return map;
    }

    /**
     * setIndex sets a position on the map to a char, or player type
     * @param x is the x coordinate on the map to be changed
     * @param y is the y coordinate on the map to be changed
     * @param c is the character that represents the character or spot type
     */
    public static void setIndex(int x, int y, char c){
        map[y][x] = c;
    }

    /**
     * getIndex grabs the index requested in the parameters
     * @param x is the x coordinate on the map
     * @param y is the y coordiante on the map
     * @return the char that is stored in the array at the index provided is returned
     */
    public static char getIndex(int x, int y){
        return map[y][x];
    }
}
