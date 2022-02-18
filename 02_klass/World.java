public class World {
    int Height;
    int Width;

    public World(int width, int height){
        this.Width = width;
        this.Height = height;
    }

    public static int generateWorldCoords(int worldSize){
        return (int) (Math.random()*(worldSize - 2)) + 1;
    }

    public void printMap(int playerX, int playerY, int enemyX, int enemyY){
        char symbol;

        for (int y = 0; y  < Height; y ++) {
            for (int x = 0; x < Width; x++) {
                if (y == 0 || y == Height - 1) {
                    symbol = '-';
                } else if (x == 0 || x == Width - 1) {
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
