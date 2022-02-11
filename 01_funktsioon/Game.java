public class Game {
    public static void main(String[] args) {
        System.out.println("Test");

        int worldHeight = 5;
        int worldWidth = 10;
        char symbol;

        for (int y  = 0; y  < worldHeight; y ++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth - 1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

}
