Here's the equivalent Java code for the given Python script. This code reads two integers `n` and `k` from the standard input, and then calculates `k * (k - 1) ^ (n - 1)` to produce the same result as the given Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long result = k * (long)Math.pow(k - 1, n - 1);
        System.out.println(result);
        scanner.close();
    }
}
```

To run this Java program, simply compile it using `javac Main.java` and then run `java Main`. When prompted, enter the test input (`2 2` in your test case) to see the expected output (`13`).
