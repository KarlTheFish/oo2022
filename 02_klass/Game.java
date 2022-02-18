import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Test");

        int worldHeight = 5;
        int worldWidth = 10;

        Player mangija1 = new Player(worldHeight, worldWidth);

        int enemyX = generateWorldCoords(worldWidth);
        int enemyY = generateWorldCoords(worldHeight);

        Direction direction = Direction.UP;

        printMap(worldHeight, worldWidth, mangija1.playerX, mangija1.playerY, enemyX, enemyY);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        mangija1.movePlayer(input, worldHeight, worldWidth);
        printMap(worldHeight, worldWidth, mangija1.playerX, mangija1.playerY, enemyX, enemyY);
        input = scanner.nextLine();
        }
    }

    public static int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }

    public static void printMap(int worldHeight, int worldWidth, int playerX, int playerY, int enemyX, int enemyY){
        char symbol;

        for (int y = 0; y  < worldHeight; y ++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth - 1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if(playerY == y && playerX == x){
                    symbol = 'x';
                }
                if(enemyY == y && enemyX == x){
                    symbol = '0';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
