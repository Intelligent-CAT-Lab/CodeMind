Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = Math.min(result, Math.max(Integer.toString(i).length(), Integer.toString(n / i).length()));
            }
        }
        System.out.println(result);

        scanner.close();
    }
}
```

This Java code captures the main logic of the original Python program, which is to find the minimum number of digits between divisors of a given number `n`. The `Math` class is used for computing the square root and the Scanner class is used for input.
