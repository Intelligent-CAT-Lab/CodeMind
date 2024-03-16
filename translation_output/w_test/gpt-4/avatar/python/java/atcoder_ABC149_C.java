Below is the translation of the provided Python code into Java. I have wrapped the code in an appropriate class and method structure. A main method reads the user's input and then calls another method that performs the same logic as the original Python code.

```java
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while (!isPrime(N)) {
            N++;
        }

        System.out.println(N);
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code should produce the same output as the original Python code when given the test input of `9552`. It will find the next prime number, which is `9587`.
