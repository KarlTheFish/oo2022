public class Item implements WorldObject {
    int itemX;
    int itemY;
    double strength;
    ItemType itemType;

    public Item(int worldWidth, int worldHeight, ItemType itemType){ //konstruktor
        this.itemX = World.generateWorldCoords(worldWidth);
        this.itemY = World.generateWorldCoords(worldHeight);
        this.itemType = itemType;
        ItemStrength(itemType);
    }

    private void ItemStrength(ItemType itemType) {
        switch (itemType) {
            case SWORD -> this.strength = 3;
            case HAMMER -> this.strength = 2;
            case DAGGER -> this.strength = 1;
            case NUKE -> this.strength = 5;
        }
    }

    public int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }
}
