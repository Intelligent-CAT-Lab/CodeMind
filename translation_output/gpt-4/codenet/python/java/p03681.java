Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    private static final long MAX = 1000000007;

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MAX;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long result = (factorial(N) * factorial(M)) % MAX;
            result = (result * 2) % MAX;
            System.out.println(result);
        } else {
            long result = (factorial(N) * factorial(M)) % MAX;
            System.out.println(result);
        }

        scanner.close();
    }
}
```

Note that in the Java code:
- I've created a `factorial` method which calculates the factorial of a number modulo MAX, since Java does not have a built-in factorial function as Python does.
- Scanner is used to handle input in a similar fashion to Python's `input().split()`.
- Java's `Math.abs()` function is used to find the absolute value of the difference, similar to the `abs` function in Python.
- In Java, all arithmetic operations with variables need to be stored back in a variable, as we aren't working in an interpreter with automatic printouts of the last operation's result. Therefore, when performing the factorial and modulo operations, we store the result before printing it.
