Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % 1000000007);
        } else {
            System.out.println((factorial(N) * factorial(M)) % 1000000007);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the difference between them, and then uses a helper function `factorial` to calculate the factorial of the two numbers. The result is then printed to the console. The `factorial` function uses a loop to calculate the factorial of a number, and it uses the modulo operator to keep the result within the range of a `long` data type.
