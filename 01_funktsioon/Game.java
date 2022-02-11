import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Test");

        int worldHeight = 5;
        int worldWidth = 10;
        int playerX = generateWorldCoords(worldWidth);
        int playerY = generateWorldCoords(worldHeight);
        int enemyX = generateWorldCoords(worldWidth);
        int enemyY = generateWorldCoords(worldHeight);

        printMap(worldHeight, worldWidth, playerX, playerY, enemyX, enemyY);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            switch (input) { //Switch kontrollib ühte muutujat mingite väärtuste vastu
                case "a":
                    playerX--;
                    break;
                case "s":
                    playerY++;
                    break;
                case "d":
                    playerX++;
                    break;
                case "w":
                    playerY--;
            }
            printMap(worldHeight, worldWidth, playerX, playerY, enemyX, enemyY);
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
