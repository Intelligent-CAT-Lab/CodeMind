Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }

        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads in the input values, calculates the values for `a` and `b`, and then prints out the maximum of the two.
