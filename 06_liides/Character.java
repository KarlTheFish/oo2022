public abstract class Character {
    int coordinateX;
    int coordinateY;

    public Character(int worldHeight, int worldWidth) {
        coordinateX = World.generateWorldCoords(worldWidth);
        coordinateY = World.generateWorldCoords(worldHeight);
    }
}
