```java
import java.util.Scanner;

public class SugarWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int maxsugar = 0;
        int maxwater = 100 * a;

        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 3001; k++) {
                    int water = 100 * a * i + 100 * b * j;
                    int sugar = c * k;

                    if (water + sugar > f) {
                        continue;
                    }

                    if (sugar > (a * i + b * j) * e) {
                        continue;
                    }

                    sugar += Math.min((f - (water + sugar)) / d * d, (((a * i + b * j) * e - c * k) / d) * d);

                    if (100 * maxsugar * (water + sugar) < 100 * sugar * (maxsugar + maxwater)) {
                        maxsugar = sugar;
                        maxwater = water;
                    }
                }
            }
        }

        System.out.println((maxsugar + maxwater) + " " + maxsugar);
    }
}
```
```
