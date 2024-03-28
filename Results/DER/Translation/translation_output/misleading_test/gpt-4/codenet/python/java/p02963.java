Here is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();

        int X1 = 0;
        int Y1 = 0;

        int tmp = (int) Math.sqrt(S);
        int X2, Y3;
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }

        int rest = X2 * X2 - S;
        int X3 = 0, Y2 = 0;

        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1_000_000_000) {
                X3 = 1;
                Y2 = rest;
            } else {
                for (int i = 2; i <= (int) Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                        break;
                    }
                }
            }
        }

        System.out.print(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```

Please note that Java uses different methods to capture user input, to parse integers, and to print output to the console, which is why there are some adjustments in those parts of the code.

In the case where `rest` is a very large integer (close to `Integer.MAX_VALUE`), careful attention must be given to potential integer overflow, particularly in the checking of factors part. If the range of S may include values that would cause `X2 * X2` to overflow an integer, additional logic would be necessary to safely handle these larger values.
