Here is the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int w = inputScanner.nextInt();
        int h = inputScanner.nextInt();
        int v = inputScanner.nextInt();
        int t = inputScanner.nextInt();
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        int p = inputScanner.nextInt();
        int q = inputScanner.nextInt();
        System.out.println(solve(w, h, v, t, x, y, p, q));
        inputScanner.close();
    }

    private static int solve(int w, int h, int v, int t, int x, int y, int p, int q) {
        int ans = 0;
        int[] aa = {p, 2*w - p};
        int[] bb = {q, 2*h - q};
        for (int a : aa) {
            for (int b : bb) {
                ans += count(w, h, v, t, x, y, a, b);
            }
        }
        return ans;
    }

    private static int count(int w, int h, int v, int t, int x, int y, int a, int b) {
        int res = 0;
        double C = v * t;
        int ky = 0;
        while (true) {
            double B = b + 2 * h * ky;
            double D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky++;
        }
        ky = -1;
        while (true) {
            double B = b + 2 * h * ky;
            double D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky--;
        }
        return res;
    }
}
```

Please note that you'll need to run this Java code inside a class in an execution environment (such as an IDE or a command line program compilation and execution), and provide input as described in the Python version.

This code defines a class `Main` with a `main` method that handles input and output. The `solve` function performs the overall calculation, and `count` encapsulates the nested looping and calculation logic. The Java version is more verbose and type-specific, as Java is statically typed, unlike Python.
