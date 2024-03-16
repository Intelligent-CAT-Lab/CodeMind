Below is the translated Python code into Java, with consideration for Java's syntax and type requirements:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buf = sc.nextLine().split("\\s+");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);

        int thres = (int) (Math.pow(10, 9) + 7);

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            BigInteger retVal = BigInteger.ONE;
            for (int i = 1; i <= N; i++) {
                retVal = retVal.multiply(BigInteger.valueOf(i).pow(2));
                if (retVal.compareTo(BigInteger.valueOf(thres)) >= 0) {
                    retVal = retVal.mod(BigInteger.valueOf(thres));
                }
            }
            retVal = retVal.multiply(BigInteger.valueOf(N + 1));
            if (retVal.compareTo(BigInteger.valueOf(thres)) >= 0) {
                retVal = retVal.mod(BigInteger.valueOf(thres));
            }
            System.out.println(retVal);
        } else if (N == M) {
            BigInteger retVal = BigInteger.valueOf(2);
            for (int i = 1; i <= N; i++) {
                retVal = retVal.multiply(BigInteger.valueOf(i).pow(2));
                if (retVal.compareTo(BigInteger.valueOf(thres)) >= 0) {
                    retVal = retVal.mod(BigInteger.valueOf(thres));
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
```

Please note that I've used `BigInteger` for calculations because the result of the original Python code likely exceeds the `int` or `long` range in Java. The `BigInteger` class can handle as big numerical values as the memory can allow.

Also, do note that the `BigInteger` values lack power operator, so `pow(2)` is used to square, and `.mod(BigInteger.valueOf(thres))` to compute the modulus instead of using the `%` operator. Additionally, to handle user input, I've used `Scanner` and split the string with `split("\\s+")` to account for regular expression use in Java.
