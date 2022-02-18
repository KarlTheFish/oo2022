import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Test");

        World world = new World(10, 5);

        Player mangija1 = new Player(world.Height, world.Width);

        Enemy vaenlane1 = new Enemy(world.Height, world.Width);

        world.printMap(mangija1.playerX, mangija1.playerY, vaenlane1.enemyX, vaenlane1.enemyY);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("end")){
            mangija1.movePlayer(input, world.Height, world.Width);
            world.printMap(mangija1.playerX, mangija1.playerY, vaenlane1.enemyX, vaenlane1.enemyY);
            input = scanner.nextLine();
        }
    }
}
