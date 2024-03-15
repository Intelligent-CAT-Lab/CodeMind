Here is the Python code translated into Java, encompassing the solution method within a `Main` class. Keep in mind that Java is a statically typed language, so we need to specify the types for all variables and parameters. Java also doesn't have a built-in equivalent for Python's `input()` and list comprehension features, so we handle input with `Scanner` and loops differently:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();

        Main main = new Main();
        int ans = main.solve(w, h, v, t, x, y, p, q);
        System.out.println(ans);
    }

    private int count(int w, int h, int v, int t, int x, int y, int a, int b) {
        int res = 0;
        int C = v * t;
        int ky = 0;
        while (true) {
            int B = b + 2 * h * ky;
            int D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky += 1;
        }
        ky = -1;
        while (true) {
            int B = b + 2 * h * ky;
            int D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky -= 1;
        }
        return res;
    }

    private int solve(int w, int h, int v, int t, int x, int y, int p, int q) {
        int ans = 0;
        int[] aOptions = {p, 2 * w - p};
        int[] bOptions = {q, 2 * h - q};

        for (int a : aOptions) {
            for (int b : bOptions) {
                ans += count(w, h, v, t, x, y, a, b);
            }
        }

        return ans;
    }
}
```

To run this code, you would typically compile the `Main.java` file with `javac Main.java` and then run the compiled bytecode with `java Main`. Input would be given on the command line just like you would when entering it for the original Python program.

Make sure you have the `import java.util.Scanner` and `import java.lang.Math` statements at the beginning of the file to use the Scanner class and math functions in Java.
