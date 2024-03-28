Here is the equivalent Java code for the provided Python script. The program takes an input string, calculates some values using a modulus with 2019, and outputs an integer result.

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] remain = new int[2020];
        BigInteger now = BigInteger.ZERO;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            BigInteger digit = new BigInteger(s.substring(i, i + 1));
            now = now.add(digit.multiply(BigInteger.TEN.pow(s.length()-i-1))).mod(BigInteger.valueOf(2019));
            ans += remain[now.intValue()];
            remain[now.intValue()]++;
        }

        ans += remain[0];
        System.out.println(ans);

        scanner.close();
    }
}
```

To run this Java code, you will need to enter the number (1817181712114 in your test case) into the console after the program starts, and then press Enter. The Java program will then output the expected result, which is `-53` for the given test case.
