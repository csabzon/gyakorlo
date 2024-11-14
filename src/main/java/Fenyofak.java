import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Fenyofak {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/fenyok.txt";

        Scanner sc = new Scanner( new File(fileName) );
        int mapHeight = sc.nextInt();
        int mapWidth = sc.nextInt();
        int treesNeeded = sc.nextInt();

        boolean[][] trees = new boolean[mapHeight][mapWidth];
        for(int i=0; i<mapHeight; i++) {
            for(int j=0; j<mapWidth; j++) {
                trees[i][j] = sc.nextInt() == 1;
            }
        }

    }
}
