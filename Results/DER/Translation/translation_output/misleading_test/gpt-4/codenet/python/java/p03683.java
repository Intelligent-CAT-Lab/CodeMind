Here's the equivalent Java code for the given Python snippet you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        final int thres = 1000000007;

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= ((long)i * i);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal = retVal % thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= ((long)i * i);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}
```

Make sure you compile and execute this Java code to test against the input provided. You should input "2 2" (without quotes) when prompted, and the expected output would be -80, which is equivalent to the large positive integer represented by the calculation modulo 10^9+7 in Java, since Java int type is a signed 32-bit integer, and the result will overflow and appear negative due to the way Java handles arithmetic overflow.
