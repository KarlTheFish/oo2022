public class Player extends Character implements WorldObject {
    Item item;

    Direction direction = Direction.UP;

    //constructor
    public Player(int worldHeight, int worldWidth){ //peab olema sama nimega kui klass
        super(worldHeight, worldWidth);
        Direction direction = Direction.UP;

    }

    public void addItem(Item item){
        this.item = item;
        System.out.println("Mängija sai eseme " + item.itemType);
    }

    public int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {

        switch (input) { //Switch kontrollib ühte muutujat mingite väärtuste vastu
            case "a" -> direction = Direction.LEFT;
            case "s" -> direction = Direction.DOWN;
            case "d" -> direction = Direction.RIGHT;
            case "w" -> direction = Direction.UP;
        }

        switch (direction) { //Switch kontrollib ühte muutujat mingite väärtuste vastu
            case LEFT:
                if (playerX > 1) {
                    playerX--;
                }
                break;
            case DOWN:
                if (playerY < (worldHeight - 2)) {
                    playerY++;
                }
                break;
            case RIGHT:
                if (playerX < (worldWidth - 2)) {
                    playerX++;
                }
                break;
            case UP:
                if (playerY > 1) {
                    playerY--;
                }
                break;
        }
    }

}
