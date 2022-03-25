import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        World world = new World(10, 5);

        Player mangija1 = new Player(world.Height, world.Width);

        Enemy vaenlane1 = new Enemy(world.Height, world.Width);

        Item sword = new Item(world.Width, world.Height, ItemType.SWORD);
        Item hammer = new Item(world.Width, world.Height, ItemType.HAMMER);
        Item dagger = new Item(world.Width, world.Height, ItemType.DAGGER);
        Item nuke = new Item(world.Width, world.Height, ItemType.NUKE);
        world.items = Arrays.asList(sword, hammer, dagger, nuke);

        world.printMap(mangija1.playerX, mangija1.playerY, vaenlane1.enemyX, vaenlane1.enemyY);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("end")){
            mangija1.movePlayer(input, world.Height, world.Width);
            for(Item item: world.items){
                if(item.itemX == mangija1.playerX && item.itemY == mangija1.playerY){
                    mangija1.addItem(item);
                    break;
                }
            }
            world.printMap(mangija1.playerX, mangija1.playerY, vaenlane1.enemyX, vaenlane1.enemyY);
            input = scanner.nextLine();
        }
    }
}
