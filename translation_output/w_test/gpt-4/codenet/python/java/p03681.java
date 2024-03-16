Here is the equivalent Java program for the given Python code:

```java
import java.util.Scanner;

public class Main {

    private static final int MAX = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % MAX);
        } else {
            System.out.println((factorial(N) * factorial(M)) % MAX);
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MAX;
        }
        return fact;
    }
}
```

Please note that since Java doesn't have a built-in factorial function, I've implemented a simple `factorial` method that computes the factorial of a number modulo `MAX` to prevent integer overflow issues. Also, make sure that the above function makes use of the modulo operation during the factorial calculation itself to keep the intermediate results within the range of `int` or `long` (depends on the range of N and M). Here, we use `long` because Java's `int` would overflow for larger values. For very large values of N and M, the result will be incorrect because it will exceed the capacity of `long`. A BigInteger implementation would be necessary in that case, but it's not needed for the range set by the problem constraints.
