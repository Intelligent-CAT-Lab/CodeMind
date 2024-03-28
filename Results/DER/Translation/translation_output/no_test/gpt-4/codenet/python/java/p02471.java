Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class ExtendedEuclid {

    public static int[] rec(int a, int b) {
        assert a >= b;
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] values = rec(b, r);
        int x = values[0];
        int y = values[1];
        int gcd = values[2];
        // a = b * q + r
        // b * x + r * y = gcd
        // a * y + b * (x - q * y) = gcd
        return new int[]{y, x - q * y, gcd};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x0, y0, gcd;
        if (a < b) {
            int[] result = rec(b, a);
            y0 = result[0];
            x0 = result[1];
            gcd = result[2];
        } else {
            int[] result = rec(a, b);
            x0 = result[0];
            y0 = result[1];
            gcd = result[2];
        }

        // -a/gcd * (x - x0) = b/gcd * (y - y0)
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        System.out.println(x + " " + y);
        scanner.close();
    }
}
```

Note that Java has strict typing, so we need to define our return types for methods and declare variable types explicitly. Also note how input is handled differently, using a `Scanner` object, and output using `System.out.println`. Compatibility with user input format may vary depending on the environment where the code is intended to be run. In a production environment, additional error handling might be needed to deal with improper inputs.
