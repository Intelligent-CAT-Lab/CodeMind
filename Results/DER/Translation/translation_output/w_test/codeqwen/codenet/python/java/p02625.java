Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] d = new long[n + 1];
        d[0] = 1;
        for (int i = 0; i < n; i++) {
            d[i + 1] = ((m - i) * ((m - n + i) * d[i] + i * d[i - 1] * (m - i + 1))) % (1000000007);
        }
        System.out.println(d[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the values of the array `d` using the formula from the Python code, and then prints the last element of the array. The `%` operator is used to perform the modulo operation, which is necessary to keep the numbers within a manageable range.
