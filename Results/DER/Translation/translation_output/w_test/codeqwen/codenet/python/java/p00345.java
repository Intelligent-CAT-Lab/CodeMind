Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - p - 1;
        int l = p - d - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(String.valueOf(x / g) + "/" + String.valueOf(y / g));
    }

    public static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the greatest common divisor (gcd) of the numerator and denominator, and prints the result in the format "numerator/denominator".
