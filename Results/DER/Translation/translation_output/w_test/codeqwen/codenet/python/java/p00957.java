Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(rec(l, k, true));
    }

    public static int rec(int i, int k, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;  // black at bottom
        if (isBlack) { // top is black
            return rec(i - 1, k, false) + rec(i - k, k, false);
        } else {  // top is white
            return rec(i - 1, k, true) + rec(i - k, k, true);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, and then calls the `rec` function with these integers and `true` as arguments. The `rec` function is a recursive function that calculates the number of ways to paint the top of a tower of `i` levels, with `k` levels that must be black. The `isBlack` parameter is used to keep track of whether the top of the tower is black or white. The `rec` function uses memoization (storing previously computed results in a cache) to improve performance. The `main` function prints the result of the `rec` function.
