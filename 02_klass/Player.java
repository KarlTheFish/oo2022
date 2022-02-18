public class Player {
    int playerX = generateWorldCoords(worldWidth);
    int playerY = generateWorldCoords(worldHeight);

    Direction direction = Direction.UP;

    //constructor
    public Player(int worldHeight, int worldWidth){ //peab olema sama nimega kui klass
        this.playerX = generateWorldCoords(worldWidth);
        this.playerY = generateWorldCoords(worldHeight);
        Direction direction = Direction.UP;

    }

    public int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        while (!input.equals("end")) {
            switch (direction) { //Switch kontrollib ühte muutujat mingite väärtuste vastu
                case LEFT:
                    if (playerX < 1) {
                        playerX--;
                    }
                    break;
                case DOWN:
                    if (playerY > worldHeight) {
                        playerY++;
                    }
                    break;
                case RIGHT:
                    if (playerX > worldWidth) {
                        playerX++;
                    }
                    break;
                case UP:
                    if (playerX < worldHeight) {
                        playerY--;
                    }
                    break;
            }

            switch (input) { //Switch kontrollib ühte muutujat mingite väärtuste vastu
                case "a" -> direction = Direction.LEFT;
                case "s" -> direction = Direction.DOWN;
                case "d" -> direction = Direction.RIGHT;
                case "w" -> direction = Direction.UP;
            }
        }
    }

}
