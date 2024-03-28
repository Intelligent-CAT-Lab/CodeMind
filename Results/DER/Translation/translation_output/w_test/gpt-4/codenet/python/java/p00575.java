Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;
import java.lang.Math;

public class CoinDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);
        double C = Double.parseDouble(input[2]);

        int a = (int)Math.ceil(C / A);

        double s = 7 * A + B;
        double t = Math.floor(C / s);
        // s is the number of coins that can be obtained in one week.
        double u = C - s * t;
        // u is the remainder.

        int v = (int)Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = (int)(7 * t + v);
        } else {
            b = (int)(7 * t + 7);
        }

        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        scanner.close();
    }
}
```

To run this Java program, ensure you have your input ready to paste or type into the console when prompted. Just like in the given python example, after running the program, input `3 0 10` and press Enter, the program should output `4`.
