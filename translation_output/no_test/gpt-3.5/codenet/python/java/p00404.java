```java
import java.util.Scanner;

public class SearchAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(search(x, y));
    }

    public static int search(int x, int y) {
        int xMin = 0;
        int yMin = 0;
        int xMax = 0;
        int yMax = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;

        while (true) {
            if (xMin <= x && x <= xMax && yMin <= y && y <= yMax) {
                return p % 3 + 1;
            }

            f = f1 + f2;
            if (p % 4 == 0) {
                xMax += f; // east
            } else if (p % 4 == 1) {
                yMax += f; // north
            } else if (p % 4 == 2) {
                xMin -= f; // west
            } else {
                yMin -= f; // south
            }

            f2 = f1;
            f1 = f;
            p++;
        }
    }
}
```
