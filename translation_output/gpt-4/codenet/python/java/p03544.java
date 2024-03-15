Here is the translation of the Python code into Java code. In Java, we would commonly use an array to store previously computed Fibonacci numbers instead of a list. Additionally, Java does not have a built-in `input()` function like Python, so we would use `Scanner` to read input from the user.

```java
import java.util.Scanner;

public class FibonacciSolver {

    public static int fib(int n) {
        int[] memo = new int[n];
        if (n >= 1) {
            memo[0] = 2;
        }
        if (n >= 2) {
            memo[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fib(N + 1));
        scanner.close();
    }
    
    public static void main(String[] args) {
        solve();
    }
}
```

Note that in Java, main method must be written inside the class to run the program successfully and scanning for input and closing the scanner is done. Do remember that array indices in Java are zero-based, just like in Python, but the ways of creating and initializing arrays are different.
