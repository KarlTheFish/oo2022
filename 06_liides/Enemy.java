public class Enemy implements WorldObject {
    int enemyX;
    int enemyY;

    //constructor
    public Enemy(int worldHeight, int worldWidth){
        this.enemyX = generateWorldCoords(worldWidth);
        this.enemyY = generateWorldCoords(worldHeight);
    }

    public int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }

}
