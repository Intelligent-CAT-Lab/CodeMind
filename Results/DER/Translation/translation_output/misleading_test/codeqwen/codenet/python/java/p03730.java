Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        foo(a, b, c);
    }

    public static void foo(int a, int b, int c) {
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the remainder of the first integer divided by the second, and then checks if the remainder is equal to the third integer. If it is, it prints "YES" and returns. If it isn't, it adds the current remainder to a set of seen remainders and continues the loop. If it goes through the entire loop without finding the third integer, it prints "NO".
