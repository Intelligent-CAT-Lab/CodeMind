Below is the translated Java code for the provided Python script:

```java
import java.util.Scanner;

public class GcdLinearCombination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

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
    }

    private static int[] rec(int a, int b) {
        assert a >= b;
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] result = rec(b, r);
        int x = result[0];
        int y = result[1];
        int gcd = result[2];
        return new int[]{y, x - q * y, gcd};
    }
}
```

Make sure to run the Java code with a valid input to receive the expected output.

Test input provided:
```
4 12
```

Expected output:
```
1 0
```
