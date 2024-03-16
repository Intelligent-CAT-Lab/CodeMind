Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        System.out.println(count(w, h, v, t, x, y, p, q));
        scanner.close();
    }

    private static int count(int w, int h, int v, int t, int x, int y, int p, int q) {
        int count = 0;
        int c = v * t;
        int[] positionsA = new int[]{p, 2 * w - p};
        int[] positionsB = new int[]{q, 2 * h - q};

        for (int a : positionsA) {
            for (int b : positionsB) {
                count += getCountForPosition(w, h, c, x, y, a, b);
            }
        }

        return count;
    }

    private static int getCountForPosition(int w, int h, int c, int x, int y, int a, int b) {
        int res = 0;
        int ky = 0;
        while (true) {
            int bAdjusted = b + 2 * h * ky;
            int d = c * c - (bAdjusted - y) * (bAdjusted - y);
            if (d < 0) {
                break;
            }
            double sq = Math.sqrt(d) + 1e-7;
            int k0 = (int) ((x - a - sq) / (2 * w));
            int k1 = (int) ((x - a + sq) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky++;
        }

        ky = -1;
        while (true) {
            int bAdjusted = b + 2 * h * ky;
            int d = c * c - (bAdjusted - y) * (bAdjusted - y);
            if (d < 0) {
                break;
            }
            double sq = Math.sqrt(d) + 1e-7;
            int k0 = (int) ((x - a - sq) / (2 * w));
            int k1 = (int) ((x - a + sq) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky--;
        }

        return res;
    }

    public static void main(String[] args) {
        solve();
    }
}
```

This Java program should provide the same output as the Python script when run with the given test input.

Please note that `Main` is the class name and `solve` is the function that mimics the Python script's main logic. The `count` function in Java is split into `count` and `getCountForPosition` for better readability and to match Python's ability to use nested functions. This Java code includes the relevant imports and uses `Scanner` for input handling.
