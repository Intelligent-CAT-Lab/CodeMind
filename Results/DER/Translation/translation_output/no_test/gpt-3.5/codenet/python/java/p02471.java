```java
import java.util.Scanner;

public class GcdLinearCombination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = rec(a, b);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] rec(int a, int b) {
        if (a < b) {
            int[] result = rec(b, a);
            int x0 = result[1];
            int y0 = result[0];
            int gcd = result[2];
            return new int[] {x0, y0, gcd};
        }

        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[] {0, 1, b};
        } else {
            int[] result = rec(b, r);
            int x = result[1];
            int y = result[0];
            int gcd = result[2];
            
            int x0 = x;
            int y0 = x - q * y;
            return new int[] {x0, y0, gcd};
        }
    }
}
```
