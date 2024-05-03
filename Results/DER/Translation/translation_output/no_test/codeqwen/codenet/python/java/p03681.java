Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        int MAX = (int) Math.pow(10, 9) + 7;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % MAX);
        } else {
            System.out.println((factorial(N) * factorial(M)) % MAX);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the difference between them, and then uses a recursive function to calculate the factorial of the two numbers. The result is then printed to the console.
