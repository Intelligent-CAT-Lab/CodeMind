Here is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N += 1;
        }
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

To use this Java program, compile it and run the compiled class. Enter the test input `9552` when prompted, and the expected output `9591` should be displayed.

