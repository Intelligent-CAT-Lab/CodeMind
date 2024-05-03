Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        //N, K = 5, 2
        //N, K = 10, 0
        //N, K = 31415, 9265

        int s = 0;
        for (int b = K + 1; b <= N; b++) {
            int an = 0;
            int j = N / b;
            an = j * (b - K);
            //System.out.println(b + ", " + an);
            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(N, (j + 1) * b - 1);
                //System.out.println(b + ", " + x1 + ", " + x2);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
            //System.out.println(b + ", " + an);
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the sum of the values of `an` for each integer `b` from `K+1` to `N`, and prints the result.
